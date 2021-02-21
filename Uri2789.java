package classes;

import java.util.Locale;
import java.util.Scanner;

public class Uri2789 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		byte c=0,p,i;
		byte v=s.nextByte();
		for(i=0;i<v;i++) {
			p=s.nextByte();
			if(p!=1) {
				c++;
			}
		}
			System.out.println(c);
	}

}
