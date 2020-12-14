package gestionCorredores.dto;

import java.util.Date;
import java.util.Map;


public class Carrera {
    private String nombre;
    private Date fecha;
    private String localizacion;
    private int maxParticipantes;
    Map <Corredor, Double> resultados;
    private boolean finalizada;

    public Carrera(String nombre, Date fecha, String localizacion, int maxParticipantes) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.localizacion = localizacion;
        this.maxParticipantes = maxParticipantes;
        this.finalizada = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public int getMaxParticipantes() {
        return maxParticipantes;
    }

    public void setMaxParticipantes(int maxParticipantes) {
        this.maxParticipantes = maxParticipantes;
    }

    public Map<Corredor, Double> getResultados() {
        return resultados;
    }

    public void setResultados(Map<Corredor, Double> resultados) {
        this.resultados = resultados;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }
    public String[] toArraySting(){
    String[] s = new String[5];
    s[0] = nombre;
    s[1] = fecha.toString();
    s[2] = localizacion;
    s[3] = String.valueOf(maxParticipantes) ;
    if (finalizada)
        s[4]="Si";
    else
        s[4]="no";
    return s;
    
    
    }

    
}
