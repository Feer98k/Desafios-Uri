package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1050 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		
			switch(a) {
			case 61:
			System.out.println("Brasilia");
			break;
			
			case 71: 
				System.out.println("Salvador");
			break;
			case 11:
				System.out.println("Sao Paulo");
			break;
			case 21: 
				System.out.println("Rio de Janeiro");
			
			case 32:
				System.out.println("Juiz de Fora");
				break;
			case 19:
				System.out.println("Campinas");
				break;
			case 27: 
				System.out.println("Vitoria");
			
			case 31: 
				System.out.println("Belo Horizonte");
				break;
			default:
				System.out.println("DDD nao cadastrado");
			
			}	
	}

}
