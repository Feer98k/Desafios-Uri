package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1060 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		byte c=0;
		float n;
		for (int i = 0; i < 6; i++) {
			n=s.nextFloat();	
			if(n>=0) {
				c++;
			}
		}
		s.close();
		System.out.println(c+" Valores positivos");
	}

}
