package senaibr.br.jkp.game;

import java.util.Scanner;
import java.util.Random;

public class GameJokenpo {

	public static void main(String[] args) {
		
		int acesso, maquina, jogador, quantidadePartida, contadorPartidas, totalVencedorJogador, totalVencedorMaquina;
		String respostaNovo;
		
		contadorPartidas = 0;
		totalVencedorJogador = 0;
		totalVencedorMaquina = 0;
		respostaNovo = "n";
		
		do {
			
			System.out.println("==================================");
			System.out.println("            JOKENPÔ v2            ");
			System.out.println("==================================");
			System.out.println("");
			
			Random sorteio = new Random();
			maquina = sorteio.nextInt(3) + 1;
			
			Scanner ler = new Scanner(System.in);
			
			do {
				System.out.println("\nQuantas partidas?: "); 
				quantidadePartida = ler.nextInt();
				if(quantidadePartida % 2 == 0) {
					System.out.print("O valor inválido, coloque um ímpar maior ou igual a 3");
					acesso = 0;
				} else {
					acesso = 1;
				}
			} while (acesso == 0);
			
			System.out.printf("\nTotal de partidas: %d", quantidadePartida);
			System.out.println("");
			
			do {
				System.out.printf("\nPartida: %b", contadorPartidas);
				
				System.out.println("Escolha uma das 3 opções: ");
				System.out.println("[1] - Pedra;");
				System.out.println("[2] - Papel;");
				System.out.println("[3] - Tesoura;");
				
				System.out.print("");
				
				System.out.print("Escolha a opção: ");
				jogador = ler.nextInt();
			
				ler.close();
				
				System.out.println("");
				
				
				System.out.println("===============================");
				System.out.println("       RESULTADO PARTIDA       ");
				System.out.println("===============================");
				System.out.println("");
				
				
				// Imprime a escolha da Máquina.
				if(maquina == 1) {
					System.out.println("A máquina escolheu Pedra!, e");
				} else if (maquina == 2) {
					System.out.println("A máquina escolheu Papel!, e");
				} else {
					System.out.println("A máquina escolheu Tesoura!, e ");
				}
				
				// Imprime a escolha do Jogador.
				if(jogador == 1) {
					System.out.println("O jogador escolheu Pedra!");
				} else if (jogador == 2) {
					System.out.println("O jogador escolheu Papel!");
				} else {
					System.out.println("O jogador escolheu Tesoura!");
				}
				
				// Imprime o resultado do game.
				if((jogador == 1 && maquina == 3) || (jogador == 2 && maquina == 1) || (jogador == 3 && maquina == 2)) {
					System.out.println("Você ganhou da máquina, meu amigo! B)");
					totalVencedorJogador++;
				} else if ((jogador == 1 && maquina == 2) || (jogador == 2 && maquina == 3) || (jogador == 3 && maquina == 1)) {
					System.out.println("Você perdeu para a máquina! :C");
					totalVencedorMaquina++;
				} else {
					System.out.println("Aconteceu um empate...");
				}
				
				contadorPartidas++;
				
			} while(contadorPartidas >= quantidadePartida);
			
			if(totalVencedorJogador > totalVencedorMaquina) {
				System.out.printf("\nO Jogador ganhou ganhou de %d x %d", totalVencedorJogador,totalVencedorMaquina);
			} else {
				System.out.printf("\nO jogador perder de %d x %d", totalVencedorJogador, totalVencedorMaquina);
			}	
			
			System.out.println("Gostaria de jogar novamente? [S/N]: ");
			respostaNovo = ler.next();
			
			ler.close();
			
		} while(respostaNovo.equalsIgnoreCase("n"));
		
		
	}

}
