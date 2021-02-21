package classes;

import java.util.Scanner;

public class uri1132 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x,y,m=0;
		x=s.nextInt();
		y=s.nextInt();
		int po;
		if(x>y) {
			int []vector = new int[x+y];
			for (po = 0; po < vector.length; po++) {
				vector[po]=po*13;
			}
			for (int i = y; i <=x; i++) {
				for (int j : vector) {
					if(i==j) {
						m+=i;
					}
				}
			}

		}
		if(x<y) {
			int []vector = new int[x+y];
			for (po = 0; po < vector.length; po++) {
				vector[po]=po*13;
			}
			for (int i = x; i <=y; i++) {
				for (int j : vector) {
					if(i==j) {
						m+=i;
					}
				}
			}

		}
		System.out.println(m);
	}
}