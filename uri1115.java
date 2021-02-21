package classes;

import java.util.Scanner;

public class uri1115 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		short x=0,y=0;
		String r="";
		do {
			x=s.nextShort();
			y=s.nextShort();
			if(x==0 ||y==0) {
				break;
			}
			if(x>0 && y>0) {
				r="primeiro";
			}
			else if(x<0 && y>0) {
				r="segundo";
			}
			else if(x<0 && y<0) {
				r="terceiro";
			}
			else if(x>0 && y<0) {
				r="quarto";
			}
			System.out.println(r);
		}
		while(x!=0 || y!=0);
		s.close(); 
	}

}
