package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1074 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		int p = s.nextInt(), n = 0;
		int[] vetor = new int[p];
		for (int i = 0; i < p; i++) {
			n = s.nextInt();
			vetor[i] = n;
		}
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == 0) {
				System.out.println("NULL");
			} else if (vetor[i] > 0 && vetor[i] % 2 == 0) {
				System.out.println("EVEN POSITIVE");
			} else if (vetor[i] > 0 && vetor[i] % 2 != 0) {
				System.out.println("ODD POSITIVE");
			} else if (vetor[i] < 0 && vetor[i] % 2 == 0) {
				System.out.println("EVEN NEGATIVE");
			} else if (vetor[i] < 0 && vetor[i] % 2 != 0) {
				System.out.println("ODD NEGATIVE");
			}

		}
		s.close();
	}

}
