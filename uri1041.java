package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1041 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		float x,y;
		String r="n";
		x=s.nextFloat();
		y=s.nextFloat();
		s.close();
		if(y==0.0 && x==0.0) {
			r="Origem";
		}
		else if(x==0.0) {
			r="Eixo X";
		}
		else if(y==0.0) {
			r="Eixo Y";
		}
		else if(x>0.0 &&y>0.0) {
			r="Q1";
		}
		else if(x<0.0 &&y>0.0) {
			r="Q2";
		}
		else if(x<0.0 &&y<0.0) {
			r="Q3";
		}
		else if(x>0.0 &&y<0.0) {
			r="Q4";
		}
		System.out.print(r+"\n");
	}

}
