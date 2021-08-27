

package calculoVotacao;

import java.util.Scanner;

public class CalculoVoto {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		String name1, name2, name3;
		double votetotal1, votetotal2, votetotal3, white, nulu, totaleleitores, percentual1, percentual2, percentual3;
		
		System.out.printf("*************************************%n");
		System.out.printf("           ELEIÇÃO SINDICAL          %n");
		System.out.printf("*************************************%n");
		
		System.out.printf("Nome do(a) candidato(a) 1: ");
		name1 = ler.next();
			
		System.out.printf("Nome do(a) candidato(a) 2: ");
		name2 = ler.next();
		
		System.out.printf("Nome do(a) candidato(a) 3: ");
		name3 = ler.next();
		
		System.out.printf("%n");
		System.out.printf("%n******** A P U R A Ç Ã O ************%n");
		
		System.out.printf("Total de votos para " + name1 + " : ");
		votetotal1 = ler.nextInt();
		
		System.out.printf("Total de votos para " + name2 + " : ");
		votetotal2 = ler.nextInt();
		
		System.out.printf("Total de votos para " + name3 + " : ");
		votetotal3 = ler.nextInt();
		
		System.out.printf("Total de votos nulos : ");
		nulu = ler.nextInt();
		
		System.out.printf("Total de votos brancos : ");
		white = ler.nextInt();
		
		ler.close();
		
		System.out.printf("*************************************");
		System.out.printf("%n          R E S U L T A D O S          %n");
		System.out.printf("*************************************%n");
		
		totaleleitores = votetotal1 + votetotal2 + votetotal3 + nulu + white;
		percentual1 = votetotal1 / totaleleitores * 100;
		percentual2 = votetotal2 / totaleleitores * 100;
		percentual3 = votetotal3 / totaleleitores * 100;
		
		System.out.printf("TOTAL DE ELEITORES: " + totaleleitores + "%n");
		System.out.println("PERCENTUAL DE VOTOS " + name1 + " : " + percentual1 + "%");
		System.out.println("PERCENTUAL DE VOTOS " + name2 + " : " + percentual2 + "%");
		System.out.println("PERCENTUAL DE VOTOS " + name3 + " : " + percentual3 + "%");
		
		System.out.printf("%n");
		System.out.printf("FIM%n");
		System.out.printf("*************************************");

	}

}
