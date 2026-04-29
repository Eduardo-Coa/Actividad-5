package Clases;

import Interfaces.HuellaCarbono;

public class Carro implements HuellaCarbono {
    private String modelo;
    private String tipoCombustible;
    private double consumoCombustible;
    private double kilometrosAnio;

    public Carro(
        String modelo, 
        String tipoCombustible, 
        double consumoCombustible, 
        double kilometrosAnio) 
        {
        this.modelo = modelo;
        this.tipoCombustible = tipoCombustible;
        this.consumoCombustible = consumoCombustible;
        this.kilometrosAnio = kilometrosAnio;
    }

    public String getModelo() {
        return modelo;
    }       

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }   

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public double getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(double consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    public double getKilometrosAnio() {
        return kilometrosAnio;
    }

    public void setKilometrosAnio(double kilometrosAnio) {
        this.kilometrosAnio = kilometrosAnio;
    }

    @Override
    public double getHuellaCarbono() {
        double litrosAnio = (consumoCombustible / 100.0) * kilometrosAnio;
        double factor = tipoCombustible.equalsIgnoreCase("diesel") ? 2.68 : 2.31;
        return litrosAnio * factor;
    }

    public double getEficienciaCombustible() {
        return 100.0 / consumoCombustible;
    }

    @Override
    public String toString() {
        return String.format("Carro        | Modelo: %-20s | Combustible: %-10s | %.1f L/100km | %.0f km/anio",
                modelo, tipoCombustible, consumoCombustible, kilometrosAnio);
    }
}
