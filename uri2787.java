package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri2787 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		byte c=0;
		short l=s.nextShort();
		short i=s.nextShort();
		short som=(short) (l+i);
		s.close();
		if(som%2==0) {
			c=1;
		}
		else {
			c=0;
		}
		System.out.println(c);

	}

}
