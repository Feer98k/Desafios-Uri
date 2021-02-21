package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1037 {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
	        Scanner s = new Scanner(System.in);
	        float n=s.nextFloat();
	        String q ="";
	        if(n>25.00001  &&n<=50.0000000) {
	        	q=("Intervalo (25,50]");
	        }
		        else if(n>=0 && n<=25.0000) {
		        	q=("Intervalo [0,25]");
		        }
		         else if(n>=50.00000001 && n<=75.0000) {
		        	 q=("Intervalo (50,75]");
		        }
		        else if(n>=75.0000001 && n<=100.00000) {
		        	q=("Intervalo (75,100]");
		        }
	        else {
	        	q=("Fora de intervalo");
	        }
	        System.out.println(q);
	}

}
