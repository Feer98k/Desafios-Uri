package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1079 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		int a,c=0;
		
		double a1,a2,a3,media;
		a=s.nextInt();
		double[] vetor = new double[a];
		while(c!=a) {
			a1=s.nextDouble();
			a2=s.nextDouble();
			a3=s.nextDouble();
			media=((a1*2)+(a2*3)+(a3*5))/10;
			vetor[c]=media;
			c++;
		}
		s.close();
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%.1f\n",vetor[i]);
		}
	}

}
