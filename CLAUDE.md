# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Compilar y ejecutar

Desde la raíz del proyecto:

```bash
# Compilar todos los archivos
javac -cp . Interfaces/HuellaCarbono.java Clases/Edificio.java Clases/Carro.java Clases/Bicicleta.java HuellaCarbonoApp.java

# Ejecutar la aplicación
java HuellaCarbonoApp
```

> No hay herramienta de build (Maven/Gradle). Se compila directamente con `javac`.

## Arquitectura

Este proyecto implementa el patrón de **interfaz polimórfica** (Deitel, *How to Program in Java*, 9th ed.).

```
Interfaces/
  HuellaCarbono.java       ← interfaz con un único método: getHuellaCarbono(): double

Clases/
  Edificio.java            ← implementa HuellaCarbono
  Carro.java               ← implementa HuellaCarbono
  Bicicleta.java           ← implementa HuellaCarbono

HuellaCarbonoApp.java      ← punto de entrada; maneja ArrayList<HuellaCarbono>
main.java                  ← clase vacía, no se usa
```

El flujo central está en `HuellaCarbonoApp`:
1. `main()` crea instancias de las 3 clases y las agrega a `ArrayList<HuellaCarbono> listaHuella`
2. `displayFootprints()` itera la lista polimórficamente, llamando `getHuellaCarbono()` y `toString()` en cada objeto

Las 3 clases **no tienen relación de herencia entre sí**; el único vínculo es la interfaz.

## Fórmulas de huella de carbono

| Clase | Fórmula | Factores |
|---|---|---|
| `Edificio` | `consumoEnergia × factor` | `0.233` kg CO₂/kWh (eléctrica) · `0.204` (gas) |
| `Carro` | `(consumoCombustible/100 × kilometrosAnio) × factor` | `2.31` kg CO₂/L (gasolina) · `2.68` (diesel) |
| `Bicicleta` | `emisionesFabricacion / aniosUso` | Amortización anual de fabricación |

## Métodos adicionales por clase

- `Edificio.getEficienciaEnergetica()` → `consumoEnergia / metrosCuadrados` (kWh/m²)
- `Carro.getEficienciaCombustible()` → `100 / consumoCombustible` (km/L)
- `Bicicleta.getKilometrosAnio()` → retorna `0.0` (sin atributo de distancia en el modelo)
