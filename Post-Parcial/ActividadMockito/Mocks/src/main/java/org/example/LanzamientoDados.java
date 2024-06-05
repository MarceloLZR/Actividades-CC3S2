package org.example;

public class LanzamientoDados {
    private final NumerosAleatorios generador;

    public LanzamientoDados(NumerosAleatorios generador) {
        this.generador = generador;
    }

    public int lanzarDado() {
        // quiero simular el lanazamiento de dados
        return generador.generarNumeroAleatorio(1,6);
    }
}
