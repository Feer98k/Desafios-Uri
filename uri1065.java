package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1065 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		byte d=0,c=0;
		for (byte i=0;i<5;i++) {
			d=s.nextByte();
			if(d%2==0) {
				c++;
			}
		}
		s.close();
		System.out.println(c+" valores pares");
	}

}
