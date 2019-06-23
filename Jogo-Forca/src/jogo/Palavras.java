package jogo;

import java.util.Random;

public class Palavras { 
    /**
     * classe destinada ao armazenamento das palavras e das dicas
     * @author Gabriel
    */
    
    
    private int indiceSorteado;
    
    
    public static String [] palavras ={"CAFE","HOMEM","MULHER","MENINIO","MENINA",
        "EU","VOCE","ELE","ELA","CEU","VIOLAO","POSSIVEL","ONIBUS","VEICULO",
        "CASA","TREM","AVIAO","PALAVRA","VIDA","MUSICA","RELOGIO","TEXTO","TELEVISAO",
        "CACHORRO","GATO","MACACO","CHAVE","ESTADO","PAIS","AGUA","SUCO","REFRIGERANTE",
        "COMIDA","CELULAR","PORCO","DENTE","BOCA","ESCOLA","COMPUTADOR","PIANO"};
//vetor destinada ao armazenamento das palavras
	
	
	
    public static String [] dicas = {"BEBIDA", "PESSOA", "PESSOA", "CRIANCA", "CRIANCA",
        "INDICATIVO", "INDICATIVO", "INDICATIVO", "INDIVATIVO", "AZUL", "CORDAS",
        "PROBABILIDADE", "VEICULO", "CARRO", "TIJOLOS", "LOCOMOCAO", "CEU", "PORTUGUES",
        "TODOS TEM", "SOM", "HORAS", "ESCREVER", "NOVELA", "ANIMAL", "ANIMAL",
        "USA NO CARRO", "PORTA", "POSSUI CIDADE", "LOCAL", "MOLHADA", "LIQUIDO",
        "LIQUIDO GASOSO", "ALIMENTO", "ELETRONICO", "SUJO", "BOCA", "DENTISTA", "ESTUDOS",
        "INFORMATICA", "INSTRUMENTO"};
	//vetor destinado ao armazenamento das dicas

        
    public String setPalavra (){
        Random random = new Random();
        indiceSorteado = random.nextInt(palavras.length);
        return palavras[indiceSorteado];
    }
    
    public String setPalavraUnderline (String palavra){
        String palavraUnderline = "";
       
        for (int i = 0; i < palavra.length(); i++){
            palavraUnderline += " _ ";
        }
        return palavraUnderline;
    }
     
    public String setDica(){
        return this.dicas[indiceSorteado];
    }
}
	