package classes;


import java.util.Scanner;

public class uri1146 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		short n=1;
		while (n != 0) {
			n = s.nextShort();
			for (short i = 1; i <= n; i++) {
				if (i == n) {
					System.out.print(i+"\n");
				} else {
					System.out.print(i+" ");
				}
			}
		} 
		s.close();
	}

}
