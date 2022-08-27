package com.cursoemvideo;

import java.util.Scanner;

public class EstruturasCondicionais {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in) ;
		/*Programa Média*/
		System.out.print("Primeira nota");
		float n1 = leia.nextFloat();
		
		System.out.print("Segunda nota");
		float n2 = leia.nextFloat();
		float m = (n1+n2) /2;
		
		System.out.println("Sua media foi: " + m);
		
		if(m>9) {
			System.out.println("Parabéns!!");
			
			/*Programa Idade*/

			System.out.println("Digite seu ano de nascimento");
			
			int nasc = leia.nextInt();
			int i = 2022 - nasc;
			
			System.out.println("Sua idade é " +i);
			
			if(i>=18) {
				System.out.println("Maior de idade");
			}else {
				System.out.println("Menor de idade");
			}
		
			
		}
		
		//Par ou Impar
		System.out.println("Digite um número");
		int y = 9;
		if(y%2==0) {
			System.out.println("Número par");
		}else {
			System.out.println("Ímpar");
		}
	}

}
