package classes;

import java.util.Scanner;

public class uri1145 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		byte x;
		short y;
		x=s.nextByte();
		y=s.nextShort();
		for (short i = 1; i <=y; i++) {
		       if (i % x == 0 || i == y){
		           System.out.printf("%d\n", i);
		        }
		        else{
		           System.out.printf("%d ", i);
		        }
		}
		
	}

}
