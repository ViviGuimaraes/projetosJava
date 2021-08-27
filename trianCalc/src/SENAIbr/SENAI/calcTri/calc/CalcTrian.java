package SENAIbr.SENAI.calcTri.calc;

import java.util.Scanner;

public class CalcTrian {

	public static void main(String[] args) {
		
		double lado1, lado2, lado3;
		String name, cond1, cond2;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Qual o seu nome?: ");
		name = ler.next();
		
		System.out.println("SEJA BEM-VINDO(a), " + name + "!");
		
		System.out.println("*** TESTE TRIÂNGUL0 ***");
		System.out.println();
		
		System.out.print("Digite o lado A do possível triângulo: ");
		lado1 = ler.nextDouble();
		
		System.out.print("Digite o lado B do possível triângulo: ");
		lado2 = ler.nextDouble();
		
		System.out.print("Digite o lado C do possível triângulo: ");
		lado3 = ler.nextDouble();
		
		ler.close();
		
		System.out.println();
		System.out.println("*** RESULTADO ***");
		
		if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado2) && (lado3 < lado2 + lado1)) {
			System.out.println("Essas medidas FORMAM um triângulo!");
			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("Temos um triângulo Equilátero!");
			} else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
				System.out.println("Temos um triângulo Escaleno!");
			} else {
				System.out.println("Temos um triângulo Isósceles");
			}

		} else {
			System.out.println("Essas medidas NÃO formam um triângulo!");
		}
			
		
	}

}