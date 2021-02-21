package classes;

import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;
import java.util.List;
import java.util.Collections;


public class uri1042 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		short v[] = new short[3];
		List<Byte> l = new Vector<>();
		for (byte i = 0; i < 3; i++) {
			byte b = s.nextByte();
			l.add(b);
			v[i] = b;
		}
		Collections.sort(l);
		for (byte j = 0; j < 3; j++) {
			System.out.println(l.get(j));
		}
		
		for (byte e = 0; e < 3; e++) {
			System.out.print("\n"+v[e]);
		}
		 System.out.print("\n");
	}

}
