package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri3055 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		int a,m,r;
		a=s.nextInt();
		m=s.nextInt();
		r=(m*2)-a;
		System.out.println(r);
	}

}
