package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1052 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		byte n=s.nextByte();
		s.close();
		String c = null;
		
		switch(n) {
		case 1:
			c="January";
			break;
		case 2:
			c="February";
			break;	
		case 3:
			c="March";
			break;	
		case 4:
			c="April";
			break;	
		case 5:
			c="May";
			break;
		case 6:
			c="June";
			break;	
		case 7:
			c="July";
			break;	
		case 8:
			c="August";
			break;	
		case 9:
			c="September";
			break;	
		case 10:
			c="Octuber";
			break;	
		case 11:
			c="November";
			break;	
		case 12:
			c="December";
			break;	
					
		}	
		System.out.println(c);
			
		}	
}
