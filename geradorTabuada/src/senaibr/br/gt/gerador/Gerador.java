package senaibr.br.gt.gerador;

import java.util.Scanner;

public class Gerador {

	public static void main(String[] args) {
		
		String escolha;
		
		do {
			
			int contador, tabuada, resposta;

			@SuppressWarnings("resource")
			Scanner leitura = new Scanner(System.in);
			
			System.out.println("================================");
			System.out.println("       GERADOR DE TABUADA       ");
			System.out.println("================================");
			System.out.println();
			System.out.print("Deseja a tabuada de qual número?: ");
			tabuada = leitura.nextInt();
			
			for(contador = 1; contador <= 10; contador++) 
			{
				resposta = contador * tabuada;
				System.out.printf("\n%d * %d = %d", contador, tabuada, resposta);
			}
			
			System.out.println();
			System.out.printf("\nGostaria de escolher outra tabuada?[S/N]: ");
			escolha = leitura.next();
			
		} while(escolha.equalsIgnoreCase("S"));
	}
}
