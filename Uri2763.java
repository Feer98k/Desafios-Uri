package classes;

import java.util.Locale;
import java.util.Scanner;

public class Uri2763 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		String cpf = s.next();

		System.out.printf("%s%s%s\n", cpf.charAt(0), cpf.charAt(1), cpf.charAt(2));
		System.out.printf("%s%s%s\n", cpf.charAt(4), cpf.charAt(5), cpf.charAt(6));
		System.out.printf("%s%s%s\n", cpf.charAt(8), cpf.charAt(9), cpf.charAt(10));
		System.out.printf("%s%s", cpf.charAt(12), cpf.charAt(13));

	}
}
