package org.example;

import java.util.Random;

public class NumerosGeneradosAleatoriamente implements NumerosAleatorios {
    private final Random random;

    public NumerosGeneradosAleatoriamente() {
        random = new Random();
    }

    @Override
    public int generarNumeroAleatorio(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
}
