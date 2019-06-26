package jogo;

import views.SegundoFrame;

public class Controle {
    /**
     * Classe destinada a validações e controle das palavras
     * @author Gabriel
     */
    public char [] letrasAcertadas = new char [22];
    
    public char [] acertos = new char [22];
    
    public char [] palavra = new char [22];
    
    public boolean perdeVida = false;
    
    public int vida = 0;
    
    SegundoFrame sf = new SegundoFrame();
    
    public void resetPalavra (String palavra){
        
        for (int i = 0; i < palavra.length(); i ++){
            
            this.palavra [i] = '_';

        }
    }
    
    
    public void setPalavra (String palavra, String letra){
        perdeVida = true;
        for (int i = 0; i < palavra.length(); i++){
        
            if(palavra.charAt(i) == letra.charAt(0)){
            
                this.palavra[i] = letra.charAt(0);
                
                perdeVida = false;
            
            }
        }
    }
    
    public void setImg (){
        if (perdeVida){
            vida ++;
            switch(vida){
                case 0:
                    sf.img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/00.jpg")));
                    break;
                case 1:
                    sf.img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/01.jpg")));
                    break;
                case 2:
                    sf.img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/02.jpg")));
                    break;
                case 3:
                    sf.img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/03.jpg")));
                    break;
                case 4:
                    sf.img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/04.jpg")));
                    break;
                case 5:
                    sf.img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/05.jpg")));
                    break;
                case 6:
                    sf.img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/06.jpg")));
                    break;
            }
        }
    }
    
    
    /*public void setPalavra (char letra){
        
        for (int i = 0; i < acertos.length; i++){
            
            if (acertos[i] == 1){
                
                palavra[i] = letra;
                
            }
        }
    }*/
    
}
