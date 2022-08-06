package br.com.systech.util;

import br.com.systech.bean.Endereco;
import com.google.gson.Gson;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Base64;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import javax.swing.AbstractAction;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.border.LineBorder;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Biblioteca {

    public static String getComputerIdentifier() {
        try {
            String macAddress = "";
            NetworkInterface bestInterface = null;
            final Enumeration<NetworkInterface> interfaces = NetworkInterface
                    .getNetworkInterfaces();
            Field indexField = null;
            try {
                indexField = NetworkInterface.class.getDeclaredField("index");
                indexField.setAccessible(true);
            } catch (NoSuchFieldException | SecurityException e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e);
            }
            while (interfaces.hasMoreElements()) {
                final NetworkInterface atualInterface = interfaces.nextElement();
                if (!atualInterface.isLoopback() && !atualInterface.isVirtual()
                        && !atualInterface.isPointToPoint()
                        && atualInterface.getHardwareAddress() != null) {
                    try {
                        if (bestInterface == null
                                || (indexField == null || indexField
                                        .getInt(bestInterface) > indexField
                                .getInt(atualInterface))) {
                            bestInterface = atualInterface;
                            InetAddress address = InetAddress.getLocalHost();
                            NetworkInterface.getByInetAddress(address);
                            if (indexField == null) {
                                break;
                            }
                        }
                    } catch (IllegalAccessException | IllegalArgumentException | SocketException | UnknownHostException e) {
                        JOptionPane.showMessageDialog(null, "Erro: " + e);
                    }
                }
            }
            if (bestInterface != null) {
                for (int i = 0; i < bestInterface.getHardwareAddress().length; i++) {
                    macAddress += (String.format("%02X", bestInterface.getHardwareAddress()[i]));
                }
                return macAddress;
            } else {
                throw new RuntimeException(
                        "Nenhuma interface de rede habilitada para identificação do computador encontrada.");
            }
        } catch (SocketException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
        return null;
    }

    public static String encode(String texto) {
        return Base64.getEncoder().encodeToString(texto.getBytes());
    }

    public static String decode(String texto) {
        return new String(Base64.getDecoder().decode(texto));
    }

    public static boolean verificavencimento(Date emissao, Date vencimento) {
        boolean validador;
        if (emissao.before(vencimento)) {
            validador = true;
        } else {
            validador = !emissao.after(vencimento);
        }
        return validador;
    }

    public static Endereco consultaCep(String cep) {
        try {
            Document doc;
            Gson gson = new Gson();
            Endereco c = new Endereco();
            doc = Jsoup.connect("https://viacep.com.br/ws/" + cep + "/json/").ignoreContentType(true).get();
            Elements links = doc.select("body");
            for (Element link : links) {
                JSONObject jsonObject = new JSONObject(link.text());
                String enderecoJson = jsonObject.toString();
                Endereco endereco = gson.fromJson(enderecoJson, Endereco.class);
                return endereco;
            }
            return c;
        } catch (IOException | JSONException ex) {
            JOptionPane.showMessageDialog(null, "Erro (1): Verifique sua conexão com a internet!\n CEP não encontrado!\n" + ex);
        }
        return null;
    }

    public static void setAcessibilidade(JFrame j) {
        JRootPane meurootpane = j.getRootPane();
        meurootpane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "ESCAPE");
        meurootpane.getRootPane().getActionMap().put("ESCAPE", new AbstractAction("ESCAPE") {
            @Override
            public void actionPerformed(ActionEvent e) {
                j.dispose();
            }
        });
    }
    
    public static void setAcessibilidade(JDialog j) {
        JRootPane meurootpane = j.getRootPane();
        meurootpane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "ESCAPE");
        meurootpane.getRootPane().getActionMap().put("ESCAPE", new AbstractAction("ESCAPE") {
            @Override
            public void actionPerformed(ActionEvent e) {
                j.dispose();
            }
        });
    }

    public static boolean validaForm(List<JPanel> list) {
        boolean control = false;
        for (JPanel jPanel : list) {
            for (Component c : jPanel.getComponents()) {
                if (c instanceof JTextField) {
                    if (((JTextField) c).isEnabled()) {
                        if (((JTextField) c).getText() == null
                                || ((JTextField) c).getText().isEmpty()) {
                            control = true;
                            ((JTextField) c).setBorder(new LineBorder(new Color(200, 0, 0)));
                        }
                    }
                }
                if (c instanceof JFormattedTextField) {
                    if (((JFormattedTextField) c).getText() == null
                            || ((JFormattedTextField) c).getText().isEmpty()
                            || ((JFormattedTextField) c).getText().contains("  ")) {
                        control = true;
                        ((JFormattedTextField) c).setBorder(new LineBorder(new Color(200, 0, 0)));
                    }
                }
                if (c instanceof JComboBox) {
                    if ((((JComboBox) c).getSelectedItem() == null
                            || ((JComboBox) c).getSelectedItem().equals(""))) {
                        control = true;
                        ((JComboBox) c).setBorder(new LineBorder(new Color(200, 0, 0)));
                    }
                }

                if (c instanceof JDateChooser) {
                    if (((JDateChooser) c).getDate() == null) {
                        control = true;
                        ((JDateChooser) c).setBorder(new LineBorder(new Color(200, 0, 0)));
                    }
                }
            }
        }
        return control;
    }

    public static BigDecimal stringToBigDecimal(String numero) {
        try {
            return new BigDecimal(numero.replace(".", "").replace(",", "."));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Valor INVÁLIDO", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public static String bigDecimalToString(BigDecimal numero) {
        String retorno = "";
        Locale brasil = new Locale("pt", "BR");
        DecimalFormat df = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(brasil));
        df.setParseBigDecimal(true);
        try {
            retorno = df.format(numero);
        } catch (Exception ex) {
        }
        return retorno;
    }
}
