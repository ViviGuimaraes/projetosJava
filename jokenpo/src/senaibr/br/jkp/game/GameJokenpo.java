package senaibr.br.jkp.game;

import java.util.Scanner;
import java.util.Random;

public class GameJokenpo {

	public static void main(String[] args) {
		
		int maquina, jogador;
		
		
		System.out.println("===============================");
		System.out.println("            JOKENPÔ            ");
		System.out.println("===============================");
		System.out.println("");
		
		Random sorteio = new Random();
		maquina = sorteio.nextInt(3) + 1;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escolha uma das 3 opçôes: ");
		System.out.println("[1] - Pedra;");
		System.out.println("[2] - Papel;");
		System.out.println("[3] - Tesoura");
		
		System.out.print("Escolha a opção: ");
		jogador = ler.nextInt();
	
		ler.close();
		
		System.out.println("");
		
		
		System.out.println("===============================");
		System.out.println("           RESULTADO           ");
		System.out.println("===============================");
		System.out.println("");
		
		if((jogador == 1 && maquina == 3) || (jogador == 2 && maquina == 1) || (jogador == 3 && maquina == 2)) {
			System.out.println("Você ganhou da máquina meu amigo!");
		} else if ((jogador == 1 && maquina == 2) || (jogador == 2 && maquina == 3)|| (jogador == 3 && maquina == 1)) {
			System.out.println("Você perdeu para a máquina!");
		} else {
			System.out.println("Aconteceu um empate...");
		}
		
		System.out.println("A máquina escolheu o valor " + maquina + " e você escolheu o valor " + jogador);
		
	}

}
