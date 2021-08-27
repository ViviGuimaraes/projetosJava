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
		
		System.out.println("*** TESTE TRI�NGUL0 ***");
		System.out.println();
		
		System.out.print("Digite o lado A do poss�vel tri�ngulo: ");
		lado1 = ler.nextDouble();
		
		System.out.print("Digite o lado B do poss�vel tri�ngulo: ");
		lado2 = ler.nextDouble();
		
		System.out.print("Digite o lado C do poss�vel tri�ngulo: ");
		lado3 = ler.nextDouble();
		
		ler.close();
		
		System.out.println();
		System.out.println("*** RESULTADO ***");
		
		if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado2) && (lado3 < lado2 + lado1)) {
			System.out.println("Essas medidas FORMAM um tri�ngulo!");
			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("Temos um tri�ngulo Equil�tero!");
			} else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
				System.out.println("Temos um tri�ngulo Escaleno!");
			} else {
				System.out.println("Temos um tri�ngulo Is�sceles");
			}

		} else {
			System.out.println("Essas medidas N�O formam um tri�ngulo!");
		}
			
		
	}

}