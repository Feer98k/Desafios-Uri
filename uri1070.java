package classes;
import java.util.Locale;
import java.util.Scanner;


/**
 * Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.

Entrada
A entrada será um valor inteiro positivo.

Saída
A saída será uma sequência de seis números ímpares.
 * @author fernando
 *
 */
public class uri1070 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int num,  c = 0;
		num = scanner.nextInt();
		if (num % 2 == 0) {
			num += 1;

			while (c < 6) {

				System.out.println(num);
				num += 2;
				c++;
			}
		}
		if (num % 2 == 1) {
			

			while (c < 6) {

				System.out.println(num);
				num += 2;
				c++;
			}
		}
	}
}