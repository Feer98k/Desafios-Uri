package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1051 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner (System.in);
		float salario,temp,temp2,temp3;
		salario=s.nextFloat();
		s.close();
		if(salario<=2000) {
			System.out.println("Isento");
		}
		if(salario>2000&&salario<=3000) {
			temp=salario-2000;
			temp=(float) (temp*0.08);
			System.out.printf("R$ %.2f",temp);
		}
		if(salario>3000&&salario<=4500) {
			temp=salario-2000;
			temp2=temp-1000;
			
			temp=(float) ((1000*0.08)+(temp2*0.18));
			System.out.printf("R$ %.2f",temp);
		}
		if(salario>4500) {
			temp=salario-2000;
			temp2=temp-1000;
			temp3=temp2-1500;
			
			temp=(float) ((1000*0.08)+(1500*0.18)+(temp3*0.28));
			System.out.printf("R$ %.2f",temp);
		}
	}

}
