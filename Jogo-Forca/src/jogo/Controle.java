package jogo;

public class Controle {
    /**
     * Classe destinada a validações e controle das palavras
     * @author Gabriel
     */
    public static String novoFormato = "";
            
            
    public static char[] verificaPalavra(String letra, String palavra, char [] acertos){
        
        String letraUpC = letra.toUpperCase();
        
        for (int i = 0; i < palavra.length(); i++){
                
            if (letraUpC.charAt(0) == palavra.charAt(i)){
                acertos[i] = 1;
            }

            else{
                acertos[i] = 0;
            }
        }
        return acertos;
    }
    
    public static String verificaPalavra (char [] acertos, String palavra, String letra){
        String underline = "";
        for (int i = 0; i < palavra.length(); i++){
            if (acertos[i] == 0){
                underline += " _ ";
            }
            else {
                underline += letra;
            }
        }
        return underline;
    }
}
