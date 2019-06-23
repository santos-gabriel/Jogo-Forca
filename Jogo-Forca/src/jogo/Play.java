package jogo;
import java.util.Random;
import java.util.Scanner;
/**
 * 
 *@author Gabriel
 */
public class Play {

	public static void main(String[] args) {
			
		Scanner sc= new Scanner (System.in);
			//instanciando Scanner
		System.out.println("Pressione [1] para jogar");			//primeiro contato com o user com valor 1 se inicia o jogo com 0 termina
		  int respost= sc.nextInt();
		
		boolean play;										//variavel booleana que controla a continuidade do jogo
		
		if (respost == 1) {
			play= true;
			//se a resposta do user for 1 a booleana receb e true e se da inicio ao jogo
		}
		else {
			play= false;
			//se a resposta do user for 0 a booleana recebe false e o jogo nem se quer inicia
		}
		
		while (play== true) {
			//while que da inicio ao jogo, while so inicia se a resposta do user der valor true a booleana
			
		Random random= new Random();
			//instanciando random
			
		String [] palavras= Palavras.palavras;
			//vetor recebendo banco de palavras armazenadas em outro vetor
		String [] dica= Palavras.dicas;
			//vetor recebendo banco de dicas que estao armazenadas em outro vetor
		
		int qtdePalavras= palavras.length;					//definindo a quantidade de palavras do vetor
		int indiceSorteado= random.nextInt(qtdePalavras);	//sorteando um numero de indice do vetor para escolha da palavra
		String palavraEscolhida= palavras[indiceSorteado];	//armazenando a palavra sorteada numa variavel String
		String dicaEscolhida= dica[indiceSorteado];			//armazenando a dica sorteada numa variavel String
		
			
		char [] acertos= new char[palavraEscolhida.length()];
			//acertos recebe o comprimento da palavra sorteada para controle de acertos
			
		for (int i=0; i < acertos.length ; i++) {
			acertos [i]= 0;
			//for faz com que o votor "acertos" vique preencido com o valor 0 posteriormente ao acertar uma palavra recebera 1
		}
		
		String letrasUtilizadas= "";						//String que futuramente ira imprimir para o user as letras que ja foram utilizadas
		
		char letra;											//variavel que armazenara a letra que o user inserir
		boolean ganhou= false;								//variavel de controle se ganhou o jogo ou nao, inicialmente come�a com valor false
		int vidas= 6;				//variavel de controle de vidas, user tera 6 vidas
		
		
		
			for (int i=0; i< palavraEscolhida.length(); i++) {
				System.out.print(" _ ");
				//for que imprimira o tamanho da palavra com underline
			}
		
			do {
				System.out.println("\n\t"+dicaEscolhida+"\t\t\t\n");	//imprime a dica para o user
				System.out.println("\n-------------------------------------------------\n");
				System.out.println("\nVidas restantes: "+vidas+			//imprime a quantidade de vidas restantes
						"\nLetras utilizadas: "+letrasUtilizadas+		//imprime as palavras que ja foram digitadas
						"\nInsira uma nova letra: ");			//solicita uma nova letra
				letra=sc.next().toUpperCase().charAt(0);		//leitura da letra em seguida transformando ela em caixa alta
				letrasUtilizadas+= letra+", ";					//variavel que armazena as letras que ja foram urilizadas
				System.out.println("\n-------------------------------------------------\n");
				
				boolean perdeuVidas= true;						//variavel de controle sobre a perca de vidas, inicia como true
	
					
				for (int i=0; i< palavraEscolhida.length(); i++) {
					//for seguido do if que sao responsavel pelo controle sobre a perca de vidas
					if (letra == palavraEscolhida.charAt(i)) {
						acertos[i]=1;
						perdeuVidas= false;
					}
				}
					
				if (perdeuVidas) {
					vidas--;
					//condicao para controlar a quantidade de vidas restantes
				}
				
				ganhou= true;							//variavel que se ja ganhou ou nao em relacao a quantidade de vida e de acertos
					
				for (int i=0; i< palavraEscolhida.length(); i++) {
					//for percorre variavel
						
					if (acertos[i]==0) {
						//if para controlar as palavras que serao exibidas
						System.out.print(" _ ");				//caso errou imprime underline na sua determinada posicao
						ganhou= false;							//caso errou variavel ganhou recebe valor false
					}
					else {
							//caso acertou imprime a palavra na sua determinada posicao
						System.out.print(" "+palavraEscolhida.charAt(i)+" ");
					}
				}
				
				
				System.out.print("\n");
				
				
			}while (!ganhou && vidas>0);						//fim do jogo (jogo so termina se ganhou for true ou vida for 0)
			
				
			if (vidas!=0) {
				//condicao final sobre a ultima mensagem a ser exibida
				System.out.println("\n---------------------------------------------\n");
					
				System.out.println("\t      ***VOC� GANHOU***");
					//mensagem caso jogador tiver ganhado
			}
			else {
				System.out.println("\n---------------------------------------------\n");
					
				System.out.println("\t      ***GAME OVER***      \n\t     ****TENTE NOVAMENTE****");
					//mensagem caso jogador tiver perdido
			}
			
			System.out.println("\t     ***JOGAR NOVAMENTE***\n\t***PRESSIONE [1] PARA CONTINUAR***");//mensagem final dando a oportunidade de jogar novamente
			  respost= sc.nextInt();		//lendo a resposta do user
			System.out.println("\n-------------------------------------------------\n");
			if (respost==1) {
				//se user responder 1 que indica jogar novamente booleana play recebera true e o jogo se inicara novamente
				play= true;
			}
			else {
				//se user nao responder 1 booleana play recebera false o que dara fim ao jogo
				play= false;
			}
		}
		
		sc.close();		//fechamento do scanner
	}

}
