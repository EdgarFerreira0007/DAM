package pt.ipb.mostrarfrase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FraseFormatterTest {

    @Test
    public void acrescentaAutorNoFinalDaFrase() {
        assertEquals(
                "A prática leva à perfeição.\nAutor desconhecido",
                FraseFormatter.juntarAutor(
                        "A prática leva à perfeição.",
                        "Autor desconhecido"
                )
        );
    }

    @Test
    public void removeEspacosExterioresDaFrase() {
        assertEquals(
                "Olá mundo\nAutor desconhecido",
                FraseFormatter.juntarAutor(
                        "  Olá mundo  ",
                        "Autor desconhecido"
                )
        );
    }

    @Test
    public void devolveVazioQuandoNaoExisteFrase() {
        assertEquals("", FraseFormatter.juntarAutor("   ", "Autor desconhecido"));
        assertEquals("", FraseFormatter.juntarAutor(null, "Autor desconhecido"));
    }
}
