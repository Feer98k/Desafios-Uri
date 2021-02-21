package classes;
import java.util.Locale;
import java.util.Scanner;

/**
 * s= Scanner
 * t=tipo de cobaia
 * qT= quantidade de testes
 * 
 * @author Fernando
 *
 */
public class uri1094 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		String t;
		short qT=0,qtdCobaias=0,qtdCoelho=0,qtdRato=0,qtdSapo=0,leitor=0;
		double pC=0,pR=0,pS=0;
		qT=s.nextShort();
		for(short i=0;i<qT;i++) {
			leitor=s.nextShort();
			qtdCobaias+=leitor;
			t=s.next();
			switch(t) {
			case "C":
				qtdCoelho+=leitor;
				leitor=0;
			case "R":
				qtdRato+=leitor;
				leitor=0;
			case "S":
				qtdSapo+=leitor;
				leitor=0;
			}			
		}
		s.close();
		System.out.println("Total: "+ qtdCobaias+" cobaias");
		System.out.println("Total de coelhos: "+qtdCoelho);
		System.out.println("Total de ratos: "+qtdRato);
		System.out.println("Total de sapos: "+qtdSapo);
		pC=(double)qtdCoelho/qtdCobaias*100;
		pR=(double)qtdRato/qtdCobaias*100;
		pS=(double)qtdSapo/qtdCobaias*100;
		System.out.printf("Percentual de coelhos: %.2f",pC);
		System.out.print(" %\n");
		System.out.printf("Percentual de ratos: %.2f",pR);
		System.out.print(" %\n");
		System.out.printf("Percentual de sapos: %.2f",pS);
		System.out.print(" %\n");		
	}
}
