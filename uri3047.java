package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri3047 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		int m, f1,f2,result;
		m=s.nextInt();
		f1=s.nextInt();
		f2=s.nextInt();
		result = m-(f1+f2);
		if(result>f1&&result>f2) {
		System.out.println(result);
		}
		if(f1>result&&f1>f2) {
			System.out.println(f1);
			}
		if(f2>result&&f2>f1) {
			System.out.println(f2);
			}
	}

}
