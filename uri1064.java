package classes;

import java.util.Locale;
import java.util.Scanner;

/**
 * Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.

Entrada
A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. Pelo menos um destes números será positivo.


 * @author fernando
 *
 */
public class uri1064 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		float num,media,somador=0;
		int pos=0;
		for(int c=0; c<6;c++){
			num=scanner.nextFloat();
			
			if(num>0) {
				pos++;
				somador+=num;
			}
		}
		scanner.close();
		media=somador/pos;
		System.out.print(pos+ " valores positivos\n");
		System.out.printf("%.1f%n",media);
	}

}
