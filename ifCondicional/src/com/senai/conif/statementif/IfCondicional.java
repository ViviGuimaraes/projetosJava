/*
 * 
 */

package com.senai.conif.statementif;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IfCondicional {

	public static void main(String[] args) {
		
		String name, srt;
		double nota1, nota2, nota3, nota4, media;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Nome do aluno: ");
		name = ler.next();
		
		System.out.print("Nota do aluno do 1� bimestre: ");
		nota1 = ler.nextDouble();
		
		System.out.print("Nota do aluno do 2� bimestre: ");
		nota2 = ler.nextDouble();
		
		System.out.print("Nota do aluno do 3� bimestre: ");
		nota3 = ler.nextDouble();
		
		System.out.print("Nota do aluno do 4� bimestre: ");
		nota4 = ler.nextDouble();
		
		ler.close();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		DecimalFormat df = new DecimalFormat("0.00");
		srt = df.format(media);
		
		if (media >= 6) {
			System.out.println("O aluno " + name + " obteve m�dia igual a " + srt + " e est� APROVADO!");
		} else if (media >= 4 && media < 6) {
			System.out.println("O aluno " + name + " obteve m�dia igual a " + srt + " e est� de RECUPERA��O!");
		} else {
			System.out.println("O aluno " + name + " obteve m�dia igual a " + srt + " e est� REPROVADO!");
		}
		
	}

}
