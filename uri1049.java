package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1049 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		String a1 = s.next();
		String a2 = s.next();
		String a3 = s.next();
		s.close();
		String a = "";
		switch (a1) {
		case "vertebrado":
			if (a2.equals("ave")) {

				if (a3.equals("carnivoro")) {
					a = "aguia";
					break;
				} else {
					a = "pomba";
					break;
				}
			} else {
				if (a3.equals("onivoro")) {
					a = "homem";
					break;
				} else {
					a = "vaca";
					break;
				}

			}
			
		case "invertebrado":
			if (a2.equals("inseto")) {

				if (a3.equals("hematofago")) {
					a = "pulga";
					break;
				} else {
					a = "largata";
					break;
				}
			} else {
				if (a3.equals("hematofago")) {
					a = "sanguessuga";
					break;
				} else {
					a = "minhoca";
					break;
				}

			}
			
		}
		System.out.println(a);
	}

}
