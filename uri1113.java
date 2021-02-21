package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1113 {

	public static void main(String[] args) {
		int x,y; 
		byte c=0;
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		while(c!=1) {
			x=scanner.nextInt();
			y=scanner.nextInt();
			if(x==y) {
				c=1;
				break;
			}
			
			if(x>y) {
				System.out.println("Decrescente");
			}else {
				System.out.println("Crescente");
			}
		
		}

	}

}
