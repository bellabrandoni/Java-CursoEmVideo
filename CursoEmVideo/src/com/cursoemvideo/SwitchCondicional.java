package com.cursoemvideo;

import java.util.Scanner;

public class SwitchCondicional {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);

		System.out.println("Quantas pernas?");
		
		int perna = leia.nextInt();
		
		String tipo = leia.toString();
		System.out.println("Isso é um(a) ");
		
		switch(perna) {
			case 1: 
				tipo = "Saci";
				break;
			case 2:
				tipo = "Bipede";
				break;
			case 3:
				tipo = "Tripe";
				break;
			case 4:
				tipo = "Quadrupede";
				break;
			case 5:
				tipo = "Aranha";
				break;
			case 6:
				tipo = "ET";
				break;
				
		}
		System.out.println(tipo);
	}

}
