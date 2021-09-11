/*MacacoQueDigitaC�digo�(Samuel Tank), 2021;
 *
 * Atualiza��o: 11/09/2021;
 * 
 * COM "FOR", TUDO FICARIA MAIS F�CIL...;
 * Deus � mais;
 */

package senaibr.br.jkp.game;

import java.util.Scanner; // Importa��o da Class Scanner;
import java.util.Random;  // Importa��o da Class Random;

public class GameJokenpo {

	public static void main(String[] args) { // CORRIGIDO;
		/*
		 * Declara��o das vari�veis;
		 */
		int acesso, maquina, jogador, quantidadePartida, totalVencedorJogador, 
		totalVencedorMaquina, Desempate, contadorPartidas,totalNecessarioInt;
		
		double totalNecessario;
		
		String resposta;
		
		resposta = "s"; // Entra no la�o do game;
		
		while((resposta.equals("S")) || (resposta.equals("s"))) 
		{
			// Atribui��o dos valores iniciais (serve como Reset das vari�veis do la�o);
			contadorPartidas= 1;
			totalVencedorJogador = 0;
			totalVencedorMaquina = 0;
			Desempate = 0;
			
			// Cria��o dos objetos: Scanner e Random;
			Scanner leitor = new Scanner(System.in); // Scanner Aberto, pois quando fechado em loop, retorna erro na class Scanner;
			Random sorteio = new Random();
			maquina = sorteio.nextInt(3) + 1;
					
			System.out.println("==================================");
			System.out.println("            JOKENP� v2            ");
			System.out.println("==================================");
			System.out.println("");
			
			do {
				// Valida��o do n�mero de partidas, impedindo n�meros pares, �mpares menos que 3 e menores que 3;
				System.out.print("Quantas partidas?: "); 
				quantidadePartida = leitor.nextInt();
				
				if((quantidadePartida % 2 == 0) || (quantidadePartida < 3)) {
					System.out.printf("Valor inv�lido, coloque um �mpar maior ou igual a 3\n");
					acesso = 0;
				} else {
					acesso = 1;
				}
				
			} while (acesso == 0);
			
			// Gera o limite necess�rio para que o game termine e um ganhador emerja;
			totalNecessario = (quantidadePartida / 2) + 1;
			totalNecessarioInt = (int)totalNecessario;
			
			System.out.println("==================================");
			System.out.printf("TOTAL DE PARTIDAS: %d\n",quantidadePartida);
			System.out.println("==================================");
			System.out.println("");
			
			while(!(totalVencedorJogador == totalNecessarioInt) && !(totalVencedorMaquina == totalNecessarioInt)) 
			{  	
				// Imprime o n�mero da partida, escolha, e resultado;
				System.out.println();
				System.out.printf("\nPARTIDA: %d\n", contadorPartidas);
				System.out.println("Escolha uma das 3 op��es: ");
				System.out.println();
				System.out.println("[1] - Pedra;");
				System.out.println("[2] - Papel;");
				System.out.println("[3] - Tesoura;");
				System.out.println();
				
				System.out.print("Escolha a op��o: ");
				jogador = leitor.nextInt();			
				
				System.out.println();
				System.out.println("----------------------------------");
				System.out.println("         RESULTADO PARTIDA        ");
				System.out.println("----------------------------------");
				System.out.println();
				
				// Imprime o resultado do game;
				do {
					// Retorna o ganhador e nega empates;
					if((jogador == 1 && maquina == 3) || (jogador == 2 && maquina == 1) || (jogador == 3 && maquina == 2)) 
					{
						// Bloco para pontua��o do jogador;
						System.out.println();
						System.out.println("Voc� GANHOU da m�quina, meu amigo! <3");
						System.out.println();
						totalVencedorJogador++; // Acrescenta 1 ponto para o jogador;
						
						Desempate = 0;
						
					} else if ((jogador == 1 && maquina == 2) || (jogador == 2 && maquina == 3) || (jogador == 3 && maquina == 1)) 
					{
						// Bloco para pontua��o da m�quina;
						System.out.println();
						System.out.println("Voc� PERDEU para a m�quina! :C");
						System.out.println();
						totalVencedorMaquina++; // Acrescenta 1 ponto para a m�quina;
						
						Desempate = 0;
						
					} else {
						// Bloco para empate e seu tratamento;
						System.out.println();
						System.out.printf("\nEmpatou, escolha novamente: ");
						System.out.println();
						System.out.println("[1] - Pedra;");
						System.out.println("[2] - Papel;");
						System.out.println("[3] - Tesoura;");
						System.out.println();
						System.out.print("Escolha a op��o: ");
						jogador = leitor.nextInt();			
						maquina = sorteio.nextInt(3) + 1;
						
						Desempate = 1;
					}
					
				} while(Desempate == 1); // se Desempate for igual a 1 ele gera novas op��es para ambos os jogadores;
					
				// Imprime a escolha da M�quina;
				if(maquina == 1) 
				{
					System.out.println("A M�QUINA escolheu Pedra!, e");
				} else if (maquina == 2) {
					System.out.println("A M�QUINA escolheu Papel!, e");
				} else {
					System.out.println("A M�QUINA escolheu Tesoura!, e ");
				}
					
				// Imprime a escolha do Jogador;
				if(jogador == 1) 
				{
					System.out.println("O JOGADOR escolheu Pedra!");
				} else if (jogador == 2) {
					System.out.println("O JOGADOR escolheu Papel!");
				} else {
					System.out.println("O JOGADOR escolheu Tesoura!");
				}
					
				contadorPartidas++; // Contador do n�mero de partidas, iniciado em 1;
			}
				
			// Imprime o resultado da partida;
			if(totalVencedorJogador > totalVencedorMaquina) 
			{
				System.out.printf("\nO Jogador ganhou de %d x %d", totalVencedorJogador,totalVencedorMaquina);
			} else {
				System.out.printf("\nO jogador perdeu de %d x %d", totalVencedorJogador, totalVencedorMaquina);
			}	
			
			// Checa se o jogador quer jogar novamente ou n�o;
			System.out.printf("\nGostaria de jogar novamente? [S/N]: ");
			resposta = leitor.next();
			
			// Nega quaisquer valores diferentes de S/N e imprime error, em seguida, solicita nova entrada at� a condi��o ser satisfeita;
			while((!resposta.equalsIgnoreCase("S")) && (!resposta.equalsIgnoreCase("N"))) 
			{

				System.out.printf("\nDigite S/s ou N/n: ");
				resposta = leitor.next();
				
			}	
		}
	}
}