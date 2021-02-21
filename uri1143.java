package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1143 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		short d=s.nextShort(),q=0,c=0;
		s.close();
		for (short i = 1; i <=d; i++) {	
			q=(short) (i*i);
			c=(short) (i*i*i);
			System.out.printf("%d %d %d\n",i,q,c);
		}
	}	
}
