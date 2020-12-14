
package gestionCorredores.dto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;


public class Corredor {
    private String nombre;
    private String dni;
    private Date fecha;
    private String direccion;
    private String telefono;
    private Map <Integer ,Carrera> dorsal;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy");


    public Corredor(String nombre, String dni,Date fecha, String direccion, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.fecha= fecha;
        this.direccion = direccion;
        this.telefono = telefono;
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Map<Integer, Carrera> getDorsal() {
        return dorsal;
    }

    public void setDorsal(Map<Integer, Carrera> dorsal) {
        this.dorsal = dorsal;
    }


    public String[] toArraySting(){
    String [] s = new String[5];
    s[0] = nombre;
    s[1] = dni;
    s[2] = sdf.format(fecha);
    s[3] = direccion;
    s[4] = telefono;
    return s;
    }   
    
}
