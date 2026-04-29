package Clases;

public class Bicicleta {
    private String tipo;
    private double peso;
    private double emisionesFabricacion;
    private int aniosUso;

    public Bicicleta(
        String tipo, 
        double peso, 
        double emisionesFabricacion, 
        int aniosUso) 
        {
        this.tipo = tipo;
        this.peso = peso;
        this.emisionesFabricacion = emisionesFabricacion;
        this.aniosUso = aniosUso;
    }

    public String getTipo() {
        return tipo;
    } 

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEmisionesFabricacion() {
        return emisionesFabricacion;
    }

    public void setEmisionesFabricacion(double emisionesFabricacion) {
        this.emisionesFabricacion = emisionesFabricacion;
    }

    public int getAniosUso() {
        return aniosUso;
    }

    public void setAniosUso(int aniosUso) {
        this.aniosUso = aniosUso;
    }
    
}