package gestionCorredores.gui.tableModels;

import gestionCorredores.dto.Corredor;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import logica.Logica;

public class CorredoresTableModel extends AbstractTableModel{
    private ArrayList <Corredor> corredores;
    String[] string = {"Nombre", "DNI", "Fecha de nacimiento", "Dirección", "Telefono"};
    public CorredoresTableModel (ArrayList<Corredor> corredores){
        this.corredores = Logica.getCorredores();
    }
    
    @Override
    public int getRowCount() {
        return corredores.size();
    }

    @Override
    public int getColumnCount() {
        return string.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return corredores.get(rowIndex).getNombre();
            case 1:
                return corredores.get(rowIndex).getDni();
            case 2:
                return corredores.get(rowIndex).getFecha();
            case 3:
                return corredores.get(rowIndex).getDireccion();
            case 4:
                return corredores.get(rowIndex).getTelefono();
        }
            return null;
    }
        @Override
    public String getColumnName(int colum){
        return string[colum];
    }
    
    
}
