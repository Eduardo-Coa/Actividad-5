package Clases;

import Interfaces.HuellaCarbono;

public class Bicicleta implements HuellaCarbono {
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

    @Override
    public double getHuellaCarbono() {
        return emisionesFabricacion / aniosUso;
    }

    public double getKilometrosAnio() {
        return 0.0;
    }

    @Override
    public String toString() {
        return String.format("Bicicleta    | Tipo: %-20s | Peso: %.1f kg | Fabricacion: %.1f kg CO2 | %d anios de uso",
                tipo, peso, emisionesFabricacion, aniosUso);
    }
}