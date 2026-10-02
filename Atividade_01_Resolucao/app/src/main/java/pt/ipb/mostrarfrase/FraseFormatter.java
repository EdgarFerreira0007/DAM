package pt.ipb.mostrarfrase;

/**
 * Contém a regra da atividade sem depender da interface Android.
 */
public final class FraseFormatter {

    private FraseFormatter() {
        // Impede a criação de objetos desta classe utilitária.
    }

    /**
     * Junta o autor ao final da frase, numa nova linha.
     *
     * @param frase frase escrita pelo utilizador
     * @param autor texto a acrescentar no final
     * @return frase formatada ou uma string vazia se a frase não tiver conteúdo
     */
    public static String juntarAutor(String frase, String autor) {
        if (frase == null || frase.trim().isEmpty()) {
            return "";
        }

        return frase.trim() + "\n" + autor;
    }
}
