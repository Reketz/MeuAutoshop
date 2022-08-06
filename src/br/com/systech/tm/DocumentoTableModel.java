package br.com.systech.tm;

import br.com.systech.bean.Documento;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class DocumentoTableModel extends AbstractTableModel {

    private List<Documento> cList = new ArrayList<>();
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private final String[] colunas = {"Codigo", "Cliente", "Tipo", "Data"};

    @Override
    public Class<?> getColumnClass(int i) {
        return Integer.class;
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return false;
    }

    @Override
    public String getColumnName(int i) {
        return colunas[i];
    }

    @Override
    public int getRowCount() {
        return cList.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {

        switch (coluna) {
            case 0:
                return cList.get(linha).getCodigo();
            case 1:
                return cList.get(linha).getCliente().getNome();
            case 2:
                return cList.get(linha).getTipo();
            case 3: {
                try {
                    return sdf.format(sdf2.parse(cList.get(linha).getFormaPagamento().getData()));
                } catch (ParseException ex) {
                    Logger.getLogger(DocumentoTableModel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        return null;
    }

    public void addRow(Documento iv) {
        this.cList.add(iv);
        this.fireTableDataChanged();
    }

    public void addList(List<Documento> ivList) {
        this.cList = ivList;
        this.fireTableDataChanged();
    }

    public List<Documento> getList() {
        return this.cList;
    }
}
