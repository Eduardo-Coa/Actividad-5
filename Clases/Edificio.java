package Clases;

public class Edificio {
    private String nombre;
    private double consumoEnergia;
    private double metrosCuadrados;
    private String tipoCalefaccion;

    public Edificio(
            String nombre,
            double consumoEnergia,
            double metrosCuadrados,
            String tipoCalefaccion)

    {
        this.nombre = nombre;
        this.consumoEnergia = consumoEnergia;
        this.metrosCuadrados = metrosCuadrados;
        this.tipoCalefaccion = tipoCalefaccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(double consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getTipoCalefaccion() {
        return tipoCalefaccion;
    }

    public void setTipoCalefaccion(String tipoCalefaccion) {
        this.tipoCalefaccion = tipoCalefaccion;
    }

}
