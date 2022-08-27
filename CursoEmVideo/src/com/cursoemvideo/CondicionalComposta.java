package com.cursoemvideo;

import java.util.Scanner;

public class CondicionalComposta {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		/*Exemplo voto*/
		System.out.print("Qual o ano do seu nascimento?");
		
		int a = leia.nextInt();
		
		int i = 2022 - a;
		
		
		System.out.println("Sua idade é " + i);
		
		if(i<16) {
			System.out.println("Não vota");
		} else {
			if(i>=16 && i<18 || (i>70)) {
				System.out.println("Voto opcional");
			} else {
				System.out.println("Voto obrigatório");
			}
		}
		
		
		
	}

}
