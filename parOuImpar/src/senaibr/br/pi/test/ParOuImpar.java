package senaibr.br.pi.test;

public class ParOuImpar {

	public static void main(String[] args) {
		
		int contador, repeticao;

		contador = 0;
		repeticao = 100;
		
		while(contador <= repeticao) {
			if(contador % 2 == 0) {
				System.out.println(contador + " -> PAR ");
			} else {
				System.out.println(contador + " -> ÍMPAR");
			}
			contador++;
		}
	}

}
