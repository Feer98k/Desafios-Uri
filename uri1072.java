package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1072 {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner s = new Scanner(System.in);
		 short a=s.nextShort(),i=0,o=0,n;
		 for(byte d=0;d<a;d++) {
			 n=s.nextByte();
			 if(n>=10 && n<=20) {
				 i++;
			 }else {
				 o++;
			 }
		 }
		 System.out.println(i+"in");
		 System.out.println(o+"out");
	}

}
