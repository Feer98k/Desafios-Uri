package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1142 {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
	     Scanner s = new Scanner(System.in);
	     short q=1,w=2,e=3,n=s.nextShort();
	     for(short d=1;d<=n;d++) {
	    	 System.out.printf("%d %d %d PUM\n",q,w,e);
	    	 q+=4;
	    	 w+=4;
	    	 e+=4;
	    	 
	     }
	     
	}

}
