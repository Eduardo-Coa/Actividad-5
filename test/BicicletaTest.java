package test;

import Clases.Bicicleta;

public class BicicletaTest {
    private static int passed = 0;
    private static int failed = 0;

    public static void main(String[] args) {
        testHuellaCarbono();
        testHuellaCarbono_otrosValores();
        testGetKilometrosAnio();

        System.out.printf("%nResultado: %d PASS | %d FAIL%n", passed, failed);
    }

    static void testHuellaCarbono() {
        Bicicleta b = new Bicicleta("Montana", 12.5, 150.0, 5);
        double esperado = 150.0 / 5; // 30.0
        check("testHuellaCarbono", Math.abs(b.getHuellaCarbono() - esperado) < 0.001);
    }

    static void testHuellaCarbono_otrosValores() {
        Bicicleta b = new Bicicleta("Urbana", 8.0, 90.0, 8);
        double esperado = 90.0 / 8; // 11.25
        check("testHuellaCarbono_otrosValores", Math.abs(b.getHuellaCarbono() - esperado) < 0.001);
    }

    static void testGetKilometrosAnio() {
        Bicicleta b = new Bicicleta("Urbana", 8.0, 90.0, 8);
        check("testGetKilometrosAnio", b.getKilometrosAnio() == 0.0);
    }

    static void check(String nombre, boolean condicion) {
        if (condicion) { System.out.println("PASS: " + nombre); passed++; }
        else           { System.out.println("FAIL: " + nombre); failed++; }
    }
}
