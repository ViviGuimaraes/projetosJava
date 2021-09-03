package com.loteria.jgloteria.sorteio;

import java.util.Random;
import java.util.*;

public class Sorteio {

	public static void main(String[] args) {
		int i, sorteado;
		Random sorteio;
		
		System.out.println("=============================");
		System.out.println("    SORTEIO DE 15 NúMEROS    ");
		System.out.println("=============================");
		
		TreeSet<Integer> conjunto = new TreeSet<Integer>();		
		sorteio = new Random();
		
		
		for(i = 0; i < 15; i++) {
			sorteado = sorteio.nextInt(25) + 1;
			for ( ; ; ) {
				if(conjunto.add(sorteado)) break; sorteado = sorteio.nextInt(15) + 1;
			}
			System.out.println(sorteado);
		}
		
	}

}
