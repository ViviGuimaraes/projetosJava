package com.senai.mv.condicional;

import java.util.Scanner;

public class MaiorValor {

	public static void main(String[] args) {
		int valor1, valor2, valor3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um valor inteiro: ");
		valor1 = ler.nextInt();
		
		System.out.print("Digite mais um valor inteiro: ");
		valor2 = ler.nextInt();
		
		System.out.print("Digite mais um valor inteiro: ");
		valor3 = ler.nextInt();
		
		ler.close();
		
		if (valor1 > valor2 && valor1 > valor3) {
			System.out.println("O valor " + valor1 + " é o maior valor!");
		} else if (valor2 > valor1 && valor2 > valor3) {
			System.out.println("O valor " + valor2 + " é o maior valor!");
		} else {
			System.out.println("O valor " + valor3 + " é o maior valor!");
		}
		
		if (valor1 < valor2 && valor1 < valor3) {
			System.out.println("O valor " + valor1 + " é o menor valor!");
		} else if (valor2 < valor1 && valor2 < valor3) {
			System.out.println("O valor " + valor2 + " é o menor valor!");
		} else {
			System.out.println("O valor " + valor3 + " é o menor valor!");
		}
		
	}
}
