package classes;

import java.util.Locale;
import java.util.Scanner;

public class URI2344 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		short n=s.nextShort();
		String a ="";
			if(n==0) {
				a="E";
			}
			else if (n>=1 && n<=35) {
				a="D";
			}
			else if (n>=36 && n<=60) {
				a="C";
			}
			else if (n>=61 && n<=85) {
				a="B";
			}
			else if (n>=86 && n<=100) {
				a="A";
			}
		System.out.println(a);
	}

}
