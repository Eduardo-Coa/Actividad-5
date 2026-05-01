package test;

import Clases.Edificio;

public class EdificioTest {
    private static int passed = 0;
    private static int failed = 0;

    public static void main(String[] args) {
        testHuellaCarbono_electrica();
        testHuellaCarbono_gas();
        testHuellaCarbono_ignoraCase();
        testEficienciaEnergetica();

        System.out.printf("%nResultado: %d PASS | %d FAIL%n", passed, failed);
    }

    static void testHuellaCarbono_electrica() {
        Edificio e = new Edificio("Test", 1000, 100, "electrica");
        check("testHuellaCarbono_electrica", Math.abs(e.getHuellaCarbono() - 233.0) < 0.001);
    }

    static void testHuellaCarbono_gas() {
        Edificio e = new Edificio("Test", 1000, 100, "gas");
        check("testHuellaCarbono_gas", Math.abs(e.getHuellaCarbono() - 204.0) < 0.001);
    }

    static void testHuellaCarbono_ignoraCase() {
        Edificio e1 = new Edificio("Test", 1000, 100, "gas");
        Edificio e2 = new Edificio("Test", 1000, 100, "GAS");
        check("testHuellaCarbono_ignoraCase", Math.abs(e1.getHuellaCarbono() - e2.getHuellaCarbono()) < 0.001);
    }

    static void testEficienciaEnergetica() {
        Edificio e = new Edificio("Test", 1000, 100, "electrica");
        check("testEficienciaEnergetica", Math.abs(e.getEficienciaEnergetica() - 10.0) < 0.001);
    }

    static void check(String nombre, boolean condicion) {
        if (condicion) {
            System.out.println("PASS: " + nombre);
            passed++;
        } else {
            System.out.println("FAIL: " + nombre);
            failed++;
        }
    }
}
