package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1021 {

	public static void main(String[] args) {
	    
        
        Locale.setDefault(Locale.US);
		Scanner a1 = new Scanner(System.in);
		String v=a1.next();
		String va=String.format("%.2f", v);
        double valorInput=Double.parseDouble(va);
        a1.close(); 
        double qtdCem,qdtCiq,qtdVin,qtdDez,qtdCin,qtDois,qtdUmm,pass,qtdCCiq,qtdCVin,qtdCDez,qtdCCin,qtdCCum;
            qtdCem=(valorInput%100);
            pass=(valorInput%100);
            qdtCiq=(pass/50);
            pass=(pass%50);
            qtdVin=(pass/20);
            pass=(pass%20);
            qtdDez=(pass/10);
            pass=(pass%10);
            qtdCin=(pass/5);
            pass=(pass%5);
            qtDois=(pass/2);
            pass=(pass%2);
            qtdUmm=(pass/1);
            pass=(pass%1);
            qtdCCiq=(pass/0.5);
            pass=(pass%0.5);
            qtdCVin=(pass/0.25);
            pass=(pass%0.25);
            qtdCDez=(pass/0.10);
            pass=(pass%0.10);
            qtdCCin=(pass/0.05);
            pass=(pass%0.05);
            qtdCCum=(pass/0.01);
                
        System.out.println("NOTAS");
        System.out.println(((int)qtdCem)+" nota(s) de R$ 100.00");
        System.out.println(((int)qdtCiq)+" nota(s) de R$ 50.00");
        System.out.println(((int)qtdVin)+" nota(s) de R$ 20.00");
        System.out.println(((int)qtdDez)+" nota(s) de R$ 10.00");
        System.out.println(((int)qtdCin)+" nota(s) de R$ 5.00");
        System.out.println(((int)qtDois)+" nota(s) de R$ 2.00");
        System.out.println("MOEDAS");
        System.out.println(((int)qtdUmm)+ " moeda(s) de R$ 1.00");
        System.out.println(((int)qtdCCiq)+" moeda(s) de R$ 0.50");
        System.out.println(((int)qtdCVin)+" moeda(s) de R$ 0.25");
        System.out.println(((int)qtdCDez)+" moeda(s) de R$ 0.10");
        System.out.println(((int)qtdCCin)+" moeda(s) de R$ 0.05");
        System.out.println(((int)qtdCCum)+" moeda(s) de R$ 0.01");

	}

}
