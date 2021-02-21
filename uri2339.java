package classes;

import java.util.Locale;
import java.util.Scanner;

public class URI2339 {

	public static void main(String[] args) {
		   Locale.setDefault(Locale.US);
	        Scanner s = new Scanner(System.in);
	        int n=0,p=0,f=0;
	        n=s.nextInt();
	        p=s.nextInt();
	        f=s.nextInt();
	        s.close();
	        if((n*f)>p) {
	        	System.out.println("N");
	        }
	        else {
	        	System.out.println("S");
	        }

	}

}
