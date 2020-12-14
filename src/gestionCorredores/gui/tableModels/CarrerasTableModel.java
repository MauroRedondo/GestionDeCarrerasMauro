package gestionCorredores.gui.tableModels;

import gestionCorredores.dto.Carrera;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import logica.Logica;


public class CarrerasTableModel extends AbstractTableModel{
    private ArrayList <Carrera> carreras;
    private String[] string = {"Nombre", "Fecha", "Localizacion", "Nº Maximo de participantes", "Finalizada"};

    public CarrerasTableModel(ArrayList<Carrera> carrera) {
        this.carreras = Logica.getCarreras();
    }
    @Override
    public int getRowCount() {
        return carreras.size();
    }

    @Override
    public int getColumnCount() {
        return string.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return carreras.get(rowIndex).getNombre();
            case 1:
                return carreras.get(rowIndex).getFecha();
            case 2:
                return carreras.get(rowIndex).getLocalizacion();
            case 3:
                return carreras.get(rowIndex).getMaxParticipantes();
            case 4:
                if( carreras.get(rowIndex).isFinalizada()){
                    return "Si";
                }else
                    return "No";
                
        }
            return null;
    }
    @Override
    public String getColumnName(int colum){
        return string[colum];
    }
    
    
    
}
