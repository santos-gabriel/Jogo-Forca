package jogo;

import javax.swing.JOptionPane;


public class Controle {
    /**
     * Classe destinada a validações e controle das palavras
     * @author Gabriel
     */
    Palavras p = new Palavras();
    
    public String palavra = p.setPalavra();
    
    public String dica = p.setDica();
    
    public char [] vetEscondida = new char [palavra.length()];
    
    public char [] vetPalavra = new char [22];
    
    public boolean acertou;
    
    public int vida = 0;
    

    
    public boolean confereLetra (String letra , String letrasUtilizadas){
        boolean igual = false;
        
        for (int i = 0; i < letrasUtilizadas.length(); i++){
        
            if (letra.charAt(0) == letrasUtilizadas.charAt(i)){
            
                igual = true;
            
            }
        
        }
        return igual;
    }
    
    
    
    public String resetPalavra (String palavra){
        String palavraUnderline = "";
        for (int i = 0; i < palavra.length(); i ++){

            this.vetEscondida [i] = '_';
            
            palavraUnderline += " "+vetEscondida[i]+" ";
            
        }
        
        return palavraUnderline;
    }
    
    
    public String setPalavra (String palavra, String letra){
        String palavraRevelada = "";
        acertou = false;
           
        for (int i = 0; i < palavra.length(); i++){

            if(palavra.charAt(i) == letra.charAt(0)){

                vetEscondida [i] = letra.charAt(0);

                acertou = true;


            }

            palavraRevelada += " "+vetEscondida [i]+" ";

        }

        if (acertou == false){

            vida ++;

        }

        return palavraRevelada;
    }
    
    
    
    public String setPalavraAcerto (String palavra, String letra){
        String palavraRevelada = "";
           
        for (int i = 0; i < palavra.length(); i++){

            if(palavra.charAt(i) == letra.charAt(0)){

                vetEscondida [i] = letra.charAt(0);

            }

            palavraRevelada += vetEscondida [i];

        }

        return palavraRevelada;
    }
    
    public String verificaChute (String palavraChute, String palavra){
        String palavraRevelada = "";
        boolean igual = true;
        
        for (int i = 0; i < palavra.length(); i++){
            if (palavraChute.charAt(i) != palavra.charAt(i)){
                igual = false;
            }
        
        }
        
        if (igual == true){
            palavraRevelada = palavra;
        }
        
        else if (igual == false){
            vida = 6;
            for (int i = 0; i < palavra.length(); i++){
            
                palavraRevelada += " "+vetEscondida[i]+" ";
                
            }
        }
        
        return palavraRevelada;
    }
}
