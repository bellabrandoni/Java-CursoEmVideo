package com.cursoemvideo;

public class OperadoresLogicosRelacionais {

	public static void main(String[] args) {
		
		int x,y,z;;
		x = 4;
		y = 7;
		z = 12;
		boolean r,q,s,p;
		r = (x<y && y<z)?true:false;//se..retornar verdadeiro ou falso
		System.out.println(r);
		
		
		q = (x<y && y==z)?true:false;//uma e a outra &&
		System.out.println(q);
		
		s = (x<y || y==z)?true:false; //ou uma ou outra, tanto faz
		System.out.println(s);
		
		p = (x<y ^ y<z)?true:false; //ou exclusivo, ou uma ou outra
		System.out.println(p);
		
	}

}
