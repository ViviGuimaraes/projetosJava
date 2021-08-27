/*
 * className: leituraScanner~
 * 
 */


package leituraScanner;

import java.util.Scanner;

public class ScannerTeclado {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String name;
		
		System.out.printf("Digite seu nome: ");
		name = ler.next();
		
		System.out.println("Seu nome é: " + name);
		ler.close();
		
		
	}

}
