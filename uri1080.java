package classes;

import java.util.Locale;
import java.util.Scanner;



/**
 * 
Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

Entrada
O arquivo de entrada contém 100 números inteiros, positivos e distintos.
 * @author fernando
 *
 */
public class uri1080 {

	public static void main(String[] args) {
 		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int c=0,p=0,t=0,i;
		for(i=1;i<=10;i++) {
			c=scanner.nextInt();
			
			if(c>t) {
				t=c;
				p=i;
			}
			
		}
		System.out.println(t);
		System.out.println(p);
 
	}

}
