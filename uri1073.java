package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1073 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		int n=s.nextInt(),r=0;
		s.close();
		for(int d=2;d<=n;d++) {
			if(d%2==0) {
				r= (d*d);
				System.out.printf("%d^2 = %d\n",d,r);
			}
		}

	}

}
