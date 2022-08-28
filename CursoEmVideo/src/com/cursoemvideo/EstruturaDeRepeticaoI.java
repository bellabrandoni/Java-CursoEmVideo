package com.cursoemvideo;

public class EstruturaDeRepeticaoI {

	public static void main(String[] args) {
		
		int cc = 0;//contador de cambalhota
		
		while(cc<10) {
			
			cc++;
			if(cc==2 || cc == 3 || cc == 4) {
				continue;
			}
			if(cc ==7) {
				break;
			}
			
			System.out.println("Cambalhota" + cc);
			
			
		}
		
	}

}
