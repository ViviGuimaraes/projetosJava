package senaiBr.senai.CV.comissao;

import java.util.Scanner;

public class ComissaoVendedor {

	public static void main(String[] args) {
		String name;
		double valorVendas;
		double tempoTrabalho;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Qual o seu nome?: ");
		name = ler.next();
		
		System.out.print("Qual o valor total da venda no m�s?: ");
		valorVendas = ler.nextDouble();
		
		System.out.print("Quantos anos voc� trabalhou na empresa?: ");
		tempoTrabalho = ler.nextDouble();
		
		ler.close();
		
		if((valorVendas > 10000 && tempoTrabalho > 1) && ( valorVendas <= 20000 && tempoTrabalho > 1)) {
			double comissao;
			comissao = (valorVendas * 0.05);
			System.out.println("A comiss�o de " + name + " ser� de " + comissao + " pelas vendas do m�s!");
		} else if (valorVendas > 20000 && tempoTrabalho > 1) {
			double comissao;
			comissao = (valorVendas * 0.10);
			System.out.println("A comiss�o de " + name + " ser� de " + comissao + " pelas vendas do m�s!");
		} else {
			double comissao;
			comissao = (valorVendas * 0.03);
			System.out.println("A comiss�o de " + name + " ser� de " + comissao + " pelas vendas do m�s!");
		}
			
	}

}
