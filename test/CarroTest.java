package test;

import Clases.Carro;

public class CarroTest {
    private static int passed = 0;
    private static int failed = 0;

    public static void main(String[] args) {
        testHuellaCarbono_gasolina();
        testHuellaCarbono_diesel();
        testHuellaCarbono_ignoraCase();
        testEficienciaCombustible();

        System.out.printf("%nResultado: %d PASS | %d FAIL%n", passed, failed);
    }

    static void testHuellaCarbono_gasolina() {
        Carro c = new Carro("Test", "gasolina", 7.5, 15000);
        double esperado = (7.5 / 100.0) * 15000 * 2.31; // 2598.75
        check("testHuellaCarbono_gasolina", Math.abs(c.getHuellaCarbono() - esperado) < 0.001);
    }

    static void testHuellaCarbono_diesel() {
        Carro c = new Carro("Test", "diesel", 10.0, 20000);
        double esperado = (10.0 / 100.0) * 20000 * 2.68; // 5360.0
        check("testHuellaCarbono_diesel", Math.abs(c.getHuellaCarbono() - esperado) < 0.001);
    }

    static void testHuellaCarbono_ignoraCase() {
        Carro c1 = new Carro("Test", "diesel", 10.0, 20000);
        Carro c2 = new Carro("Test", "DIESEL", 10.0, 20000);
        check("testHuellaCarbono_ignoraCase", Math.abs(c1.getHuellaCarbono() - c2.getHuellaCarbono()) < 0.001);
    }

    static void testEficienciaCombustible() {
        Carro c = new Carro("Test", "gasolina", 7.5, 15000);
        double esperado = 100.0 / 7.5; // ~13.333
        check("testEficienciaCombustible", Math.abs(c.getEficienciaCombustible() - esperado) < 0.001);
    }

    static void check(String nombre, boolean condicion) {
        if (condicion) { System.out.println("PASS: " + nombre); passed++; }
        else           { System.out.println("FAIL: " + nombre); failed++; }
    }
}
