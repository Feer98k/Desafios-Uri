package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1116 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		double x,y,d;		
		double r;
		d=s.nextInt();
		String v[]= new String[ (int) d];
		for(int i=0;i<d;i++) {
			x=s.nextDouble();
			y=s.nextDouble();
			if(y==0) {
				v[i]="divisao impossivel";
			}else {
				r=x/y;
				v[i]=""+r;
			}
		}
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
	}

}
