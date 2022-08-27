package com.cursoemvideo;

public class OperadoresAritimeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			int n1 = 3;
			int n2 = 5;
			float m = (n1 + n2)/2;
			System.out.println("A média é igual a " + m);
			
			int numero = 5;
			numero ++;// -> 5 =5+1
			System.out.println(numero);//numero =6 
			
			////////////PRÉ INCREMENTO
			int numeros = 5;
			int valor =5 + ++numeros;// -> ++ = numero já pre incrementado (numero++)-> 5+1 =6 +5
			System.out.println(valor);//11
			
			///////PÓS INCREMENTO
			//++depois significa = faça todas a operacoes que precisar e depois some mais um no número
			int nota = 5;
			int valores = 5 + nota++;//soma 5 +5 e depovalor antigo
			System.out.println(valores);//10
			System.out.println(nota);//6
			
			/////////////////////
			int numeroo = 20;
			int valorr = 4 + numero--;//numero -- ->elimina um unicada
			System.out.println(valorr);//14
			System.out.println(numeroo);//9
			
			///////
			int x = 4 ;
			x+=2;// x=x+2
			System.out.println(x);
			
			///////////////
			int y = 4;
			y *= 2;// y = y *2
			System.out.println(y);
			
			
	}

}
