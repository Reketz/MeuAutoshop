package br.com.systech.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

public class ConexaoBanco {

    private static Connection con = null;
    private static ConfiguracaoController cc = null;

    public ConexaoBanco() {
    }

    public static Connection conexao() throws ClassNotFoundException, SQLException {
        cc = new ConfiguracaoController();
        cc.loadProperties();
        ConfiguracaoUtil cUtil = cc.getConfiguracaoUtil();
        Properties props = new Properties();

        props.setProperty("user", cUtil.getUserNameBD());
        props.setProperty("password", cUtil.getPasswordBD());
        props.setProperty("encoding", "UNICODE_FSS");
        props.setProperty("defaultResultSetHoldable", "True");
        try {
            Class.forName("org.firebirdsql.jdbc.FBDriver").newInstance();
            con = DriverManager.getConnection(
                    "jdbc:firebirdsql://" + cUtil.getHostBD() + ":" + cUtil.getPortBD() + "/" + cUtil.getUrlBD(),
                    props);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            JOptionPane.showMessageDialog(null, "O driver de conexão nao foi adicionado ao projeto.\n" + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas nos parâmetros de conexão.\n" + e.getMessage());
        }
        return con;
    }

}
