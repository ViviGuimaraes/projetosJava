package sanaibr.br.mult4.multiplos;

public class MultiplosDe4 {

	public static void main(String[] args) {
		
		int contador, chegada;
		
		contador = 0;
		chegada = 100;

		while(contador <= chegada) {
			if(contador % 4 == 0) {
				System.out.println(contador);
			} else {
				System.out.print("");
			}
			contador++;
		}
	}
}
