package leituraScanner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SomaDeNum {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Double num1, num2, res;
		String Res, name;
		
		System.out.printf("Digite seu nome: ");
		name = ler.next();
		
		System.out.printf(name + " Digite um número para soma: ");
		num1 = ler.nextDouble();
		
		System.out.printf(name + " Digite um segundo número para soma: ");
		num2 = ler.nextDouble();
		
		ler.close();
		
		res = num1 + num2;
		 
		DecimalFormat deci = new DecimalFormat("0.##");
		Res = deci.format(res);
		
		 
		System.out.printf(name + " A soma das parcelas é = " + Res);
		
		
		
	}
}
