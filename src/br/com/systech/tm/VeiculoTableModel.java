package br.com.systech.tm;

import br.com.systech.bean.Veiculo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class VeiculoTableModel extends AbstractTableModel {

    private List<Veiculo> cList = new ArrayList<>();
    private final String[] colunas = {"Codigo", "Marca", "Modelo", "Tipo"};

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
                return cList.get(linha).getMarca();
            case 2:
                return cList.get(linha).getModelo();
            case 3:
                return cList.get(linha).getTipo();

        }
        return null;
    }

    public void addRow(Veiculo iv) {
        this.cList.add(iv);
        this.fireTableDataChanged();
    }

    public void addList(List<Veiculo> ivList) {
        this.cList = ivList;
        this.fireTableDataChanged();
    }

    public List<Veiculo> getList() {
        return this.cList;
    }
}
