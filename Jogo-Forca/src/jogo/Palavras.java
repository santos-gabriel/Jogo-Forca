package jogo;

import java.util.ArrayList;
import java.util.Random;

public class Palavras extends Geracao {

    /**
     * classe destinada ao armazenamento das palavras e das dicas, onde enviando
     * o caminho dos arquivos para a classe pai realizando assim a leitura dos
     * arquivos contendo as palavras e as dicas
     *
     * @version V3.0
     * @author Gabriel
     */
    private final ArrayList<String> palavras = getRead("src/arq/palavrasJF.conf");
    private final ArrayList<String> dicas = getRead("src/arq/dicasJF.conf");
    private int indice;
    private final Random rm = new Random();

    public String setPalavra() {
        indice = rm.nextInt(palavras.size());
        return palavras.get(indice);
    }

    public String setPalavraUnderline(String palavra) {
        String palavraUnderline = "";

        for (int i = 0; i < palavra.length(); i++) {
            palavraUnderline += " _ ";
        }
        return palavraUnderline;
    }

    public String setDica() {
        return dicas.get(indice);
    }

}
