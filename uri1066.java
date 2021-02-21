package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1066 {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
	        Scanner scanner = new Scanner(System.in);
	         int valor,contImpar=0,contPar=0,contPositivo=0,contNegativo=0;
	        for(int i=1;i<6;i++) {
	        	
	        	valor=scanner.nextInt();
	        	if(valor%2==0) {
	        		contPar++;
	        	}else {
	        		contImpar++;
	        	}
	        	if(valor>0) {
	        		contPositivo++;
	        	}else {
	        		if(valor<0) {
	        			
	        		
	        		contNegativo++;
	        		}
	        	}
	        	
	        }
	        System.out.printf("%d valor(es) par(es)\n",contPar);
	        System.out.printf("%d valor(es) impar(es)\n",contImpar);
	        System.out.printf("%d valor(es) positivo(s)\n",contPositivo);
	        System.out.printf("%d valor(es) negativo(s)\n",contNegativo);
	}

}
