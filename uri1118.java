package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1118 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		double a=0,b=0,r=0,n,c=0;
		byte o=1;
		do {
			n=s.nextDouble();
			if(n>0 &&n<=10&&c==0) {
				a=n;
				c++;
			}else if(n>0 &&n<=10&&c==1) {
				b=n;
				r= (a+b)/2;
				System.out.printf("media = %.2f\n",r);
			do {
				
				System.out.println("novo calculo (1-sim 2-nao)");
				o=s.nextByte();
				if(o==1) {
					c=0;
					break;
				}else if(o==2) {
					break;
				}
			}while(o!=2||o!=1);
			}
			else {
				System.out.println("nota invalida");
			}
			
		
		}while(o==1);
		
	}

}
