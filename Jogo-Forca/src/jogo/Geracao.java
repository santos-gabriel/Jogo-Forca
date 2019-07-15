package jogo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Classe pai destinada a realização da leitura dos arquivos contendo na qual
 * será enviado o caminho pela classe filha
 *
 * @version V3.0
 * @author gabriel
 */
public class Geracao {

    private static ArrayList<String> Read(String caminho) {

        ArrayList<String> conteudo = new ArrayList();

        FileReader arquivo = null;

        try {
            arquivo = new FileReader(caminho);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ERROR\nArquivo não encontrado: " + ex);
        }

        BufferedReader leitura = new BufferedReader(arquivo);

        String linha = "";

        try {
            linha = leitura.readLine();

            while (linha != null) {
                conteudo.add(linha);
                linha = leitura.readLine();
            }

            arquivo.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "ERROR\nNão foi possível ler o arquivo: " + ex);
        }

        return conteudo;
    }

    public static ArrayList<String> getRead(String caminho) {

        ArrayList<String> conteudo = Read(caminho);

        return conteudo;
    }

}
