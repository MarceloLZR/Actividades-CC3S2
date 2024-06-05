import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.LanzamientoDados;
import org.example.StubNumerosAleatorios;
import org.junit.jupiter.api.Test;

public class LanzamientoDadosTest {

    @Test
    public void testLanzarDado() {
        // Configurar el stub para devolver un número fijo (3 en este caso)
        StubNumerosAleatorios stub = new StubNumerosAleatorios(3);
        LanzamientoDados lanzamiento = new LanzamientoDados(stub);

        // Lanzar el dado y verificar que devuelve el número esperado
        assertEquals(3, lanzamiento.lanzarDado());
    }
}
