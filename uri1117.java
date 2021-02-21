package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1117 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		double a=0,b=0,r=0,n,c=0;
		do {
			n=s.nextDouble();
			if(n>0 &&n<=10&&c==0) {
				a=n;
				c++;
			}else if(n>0 &&n<=10&&c==1) {
				b=n;
				r= (a+b)/2;
				System.out.printf("media = %.2f\n",r);
			}
			else {
				System.out.println("nota invalida");
			}
		}while(r==0);
		
	}

}
