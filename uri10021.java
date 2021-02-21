package classes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class uri10021 {

	public static void main(String[] args) {
 		Locale.setDefault(Locale.US);
		Scanner a1 = new Scanner(System.in);
		double valorInput = a1.nextDouble();
		int qtd=(int)valorInput;
		
		a1.close();

		System.out.println("NOTAS");
		qtd = (int) (valorInput / 100);
		System.out.println( qtd + " nota(s) de R$ 100.00");
		valorInput = (valorInput % 100);
		qtd = (int) (valorInput / 50);
		System.out.println(qtd + " nota(s) de R$ 50.00");
		valorInput = (valorInput % 50);
		qtd = (int) (valorInput / 20);
		System.out.println( qtd+ " nota(s) de R$ 20.00");
		valorInput = (valorInput % 20);
		qtd = (int) (valorInput / 10);
		System.out.println( qtd + " nota(s) de R$ 10.00");
		valorInput = (valorInput % 10);
		qtd = (int) (valorInput / 5);
		System.out.println(qtd + " nota(s) de R$ 5.00");
		valorInput = (valorInput % 5);
		qtd = (int) (valorInput / 2);
		System.out.println( qtd + " nota(s) de R$ 2.00");
		valorInput = (valorInput % 2);
		
		
		qtd = (int) (valorInput / 100);
		System.out.println("MOEDAS"); 
		System.out.println( qtd + " moeda(s) de R$ 1.00");
		valorInput = (valorInput % 100.0);
		qtd = (int) (valorInput / 50);
		System.out.println( qtd + " moeda(s) de R$ 0.50");
		valorInput = (valorInput % 50.0);
		qtd = (int) (valorInput / 25);
		System.out.println( qtd+ " moeda(s) de R$ 0.25");
		valorInput = (valorInput % 25.00);
		qtd = (int) (valorInput / 10);
		System.out.println( qtd  + " moeda(s) de R$ 0.10");
		valorInput = (valorInput % 10.0);
		qtd = (int) (valorInput / 5);
		System.out.println( qtd + " moeda(s) de R$ 0.05");
		valorInput = (valorInput % 5.00);
		qtd = (int) (valorInput /1);
		System.out.println( qtd+ " moeda(s) de R$ 0.01");

	}

}
