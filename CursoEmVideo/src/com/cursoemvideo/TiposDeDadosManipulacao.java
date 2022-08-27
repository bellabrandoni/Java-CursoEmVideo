package com.cursoemvideo;

import java.util.Scanner;

public class TiposDeDadosManipulacao {

	public static void main(String[] args) {
	/*tipo de dado e manipulacao simples
		int idade = 3;  /idade recebe 3
	*/
		
		/*Typecast
		int idades = (int)3 /considere int com 3
		*/
		
		/*Wrapper Class
		Integer numero = new Integer(3); Transforma em objeto
		Integer é uma classe, new cria um objeto
		*/
		
		/*Tipo de dados primitivos - saída de dados*/
		String nome = "fulana";
		float nota  = 8.5f;
		/*System.out.printf("A nota de %s é %f,", nome ,nota);*/
		
		/*Entrada de dados*/
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		String nomes = leia.nextLine();
		
		System.out.println("Digit a nota do aluno");
		float notas = leia.nextFloat();
		
		System.out.printf("A nota de %s é %f,", nomes ,notas);;
		
		/*Covertendo dados*/
		
		int numero = 30;
		String valor = Integer.toString(numero);
		/*Integer - classe invólocro.  toString = comnverte inteiro para string*/
		
		/*Convertendo String para inteiro*/
		String valores = "40";
		int idade = Integer.parseInt(valores);
		
		/*Convertendo String para float*/	
		String marcas = "5.5";
		float roupa = Float.parseFloat(marcas);
	}

}
