package org.example;

public class AplicacionProduccion {

    public static void main(String[] args) {

        NumerosAleatorios generadorAleatorio = new NumerosGeneradosAleatoriamente();


        LanzamientoDados lanzamientoDados = new LanzamientoDados(generadorAleatorio);

        // Resultado
        int resultado = lanzamientoDados.lanzarDado();
        System.out.println("El resultado del lanzamiento es: " + resultado);
    }
}
