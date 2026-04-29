import java.util.ArrayList;
import Clases.Edificio;
import Clases.Carro;
import Clases.Bicicleta;
import Interfaces.HuellaCarbono;

public class HuellaCarbonoApp {
    private ArrayList<HuellaCarbono> listaHuella;

    public HuellaCarbonoApp() {
        listaHuella = new ArrayList<>();
    }

    public static void main(String[] args) {
        HuellaCarbonoApp app = new HuellaCarbonoApp();

        app.listaHuella.add(new Edificio("Torre Empresarial", 85000, 1200, "electrica"));
        app.listaHuella.add(new Edificio("Casa Familiar",     18000,  150, "gas"));
        app.listaHuella.add(new Carro("Toyota Corolla", "gasolina", 7.5,  15000));
        app.listaHuella.add(new Carro("Ford Ranger",    "diesel",   10.2, 20000));
        app.listaHuella.add(new Bicicleta("Montana", 12.5, 150.0, 5));
        app.listaHuella.add(new Bicicleta("Urbana",   8.0,  90.0, 8));

        app.displayFootprints();
    }

    public void displayFootprints() {
        System.out.println("============================================================");
        System.out.println("         REPORTE DE HUELLA DE CARBONO (kg CO2/anio)        ");
        System.out.println("============================================================");
        for (HuellaCarbono item : listaHuella) {
            System.out.println(item);
            System.out.printf("             Huella de carbono: %.2f kg CO2/anio%n%n", item.getHuellaCarbono());
        }
    }
}
