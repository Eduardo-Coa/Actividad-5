package Clases;

public class Carro {
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


    
}
