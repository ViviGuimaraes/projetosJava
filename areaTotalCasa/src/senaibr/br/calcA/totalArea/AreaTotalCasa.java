package senaibr.br.calcA.totalArea;

import java.util.Scanner;

public class AreaTotalCasa {

	public static void main(String[] args) {
		
		String comodoName, respComodo;
		double largura, comprimento, totalArea, soma;
		
;		Scanner ler = new Scanner(System.in);
		
		System.out.println("===================================");
		System.out.println("    Calculo da �rea de uma casa    ");
		System.out.println("===================================");
		System.out.println("");
	
		soma = 0;
		respComodo = "S"; 
		
		while((respComodo.equals("S")) || (respComodo.equals("s"))){
			System.out.print("Qual o nome do c�modo?: ");
			comodoName = ler.next();
				
			System.out.print("Qual a largura?: ");
			largura = ler.nextDouble();
				
			System.out.print("Qual o comprimento?: ");
			comprimento = ler.nextDouble();
				
			totalArea = largura * comprimento;
			soma = soma + totalArea; 
				
			System.out.print("Gostaria de adicionar um c�modo? [S/N]");
			respComodo = ler.next();
		}
		System.out.println("");
		System.out.println("===================================");
		System.out.println("A �rea total da casa � : " + soma);
		System.out.println("");
		System.out.println("*** FIM ***");
	} 
					
}


