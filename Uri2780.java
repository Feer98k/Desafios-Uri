package classes;

import java.util.Locale;
import java.util.Scanner;

public class Uri2780 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		short d=s.nextShort();
		byte n =0;
		s.close();
		if(d<=800) {
			n=1;
		}else if(d>800 && d<=1400) {
			n=2;
		}else if(d>1400) {
			n=3;
		}
		System.out.println(n);
	}

}
