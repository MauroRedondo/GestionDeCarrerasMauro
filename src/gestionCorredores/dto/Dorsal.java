package gestionCorredores.dto;

public class Dorsal {
    private int id;
    private double tiempo;

    public Dorsal(int id, double tiempo) {
        this.id = id;
        this.tiempo = tiempo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
    
    

}
