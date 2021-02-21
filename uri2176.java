package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri2176 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		String e=s.next();
		int m= Integer.parseInt(e);
		String c=" ";
		if(m%2==0) {
			c=e+"0";
		}
		if(m%2==1){
			c=e+"0";
		}
		System.out.println(c);
	}

}
