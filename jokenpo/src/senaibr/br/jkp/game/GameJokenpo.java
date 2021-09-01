package senaibr.br.jkp.game;

import java.util.Scanner;
import java.util.Random;

public class GameJokenpo {

	public static void main(String[] args) {
		
		int maquina, jogador;
		
		
		System.out.println("===============================");
		System.out.println("            JOKENP�            ");
		System.out.println("===============================");
		System.out.println("");
		
		Random sorteio = new Random();
		maquina = sorteio.nextInt(3) + 1;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escolha uma das 3 op��es: ");
		System.out.println("[1] - Pedra;");
		System.out.println("[2] - Papel;");
		System.out.println("[3] - Tesoura");
		
		System.out.print("Escolha a op��o: ");
		jogador = ler.nextInt();
	
		ler.close();
		
		System.out.println("");
		
		
		System.out.println("===============================");
		System.out.println("           RESULTADO           ");
		System.out.println("===============================");
		System.out.println("");
		
		
		// Imprime a escolha da M�quina.
		if(maquina == 1) {
			System.out.println("A m�quina escolheu Pedra!, e");
		} else if (maquina == 2) {
			System.out.println("A m�quina escolheu Papel!, e");
		} else {
			System.out.println("A m�quina escolheu Tesoura!, e ");
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
			System.out.println("Voc� ganhou da m�quina, meu amigo! B)");
		} else if ((jogador == 1 && maquina == 2) || (jogador == 2 && maquina == 3) || (jogador == 3 && maquina == 1)) {
			System.out.println("Voc� perdeu para a m�quina! :C");
		} else {
			System.out.println("Aconteceu um empate...");
		}
		
		System.out.println("muito gay!");
		
	}

}
