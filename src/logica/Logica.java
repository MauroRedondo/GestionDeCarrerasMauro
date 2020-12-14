package logica;

import gestionCorredores.dto.Carrera;
import gestionCorredores.dto.Corredor;
import java.util.ArrayList;


public class Logica {
        private static ArrayList <Corredor> corredores = new ArrayList();
        private static ArrayList <Carrera> carreras = new ArrayList();
        
        
    public static void añadirCorredor(Corredor corredor){
        corredores.add(corredor);
    }
    public static void añadirCarrera(Carrera carrera){
        carreras.add(carrera);
    }

    public static ArrayList<Corredor> getCorredores() {
        return corredores;
    }

    public static ArrayList<Carrera> getCarreras() {
        return carreras;
    }  
}
