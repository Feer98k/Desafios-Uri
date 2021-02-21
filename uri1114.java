package classes;

import java.util.Scanner;

public class uri1114 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		short k=2002,d=0;	
		do {
			d=s.nextShort();
			if(d!=2002) {
			System.out.println("Senha Invalida");}
		}while(d!=2002);
		s.close();
		System.out.println("Acesso Permitido");
	}

}
