package org.example;

//Paso 3: generar stub (version falsa de un objeto)
public class StubNumerosAleatorios implements NumerosAleatorios {
    private int numeroFijo;

    public StubNumerosAleatorios(int numeroFijo) {
        this.numeroFijo = numeroFijo;
    }

    @Override
    public int generarNumeroAleatorio(int min, int max) {
        // Devuelve un número fijo para simular el lanzamiento controlado
        return numeroFijo;
    }
}
