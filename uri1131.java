package classes;

import java.util.Scanner;

public class uri1131 {

	public static void main(String[] args) {
		byte i,g,vI = 0,vG = 0,c = 0,e = 0,cJ=0;
		Scanner s = new Scanner(System.in);
		do {
			i=s.nextByte();
			g=s.nextByte();
			if(i>g) {	
				vI++;
				cJ++;
				i=0;
				g=0;
			}else if(g>i) {
				vG++;
				cJ++;
				g=0;
				i=0;
			}else if(i==g) {
			e++;
			cJ++;
			}
			do {
			System.out.println("Novo grenal (1-sim 2-nao)");
			c=s.nextByte();
		
			if(c==1) {
				
				break;
			}else if(c==2) {
				break;
			}
			}while(c!=1||c!=2);
		}while(c==1);
		System.out.println(cJ+" grenais");
		System.out.println("Inter:"+vI);
		System.out.println("Gremio:"+vG);
		System.out.println("Empates:"+e);
		if(vI>vG) {
			System.out.println("Inter venceu mais");
		}else if (vI<vG) {
			System.out.println("Gremio venceu mais");
		}
		else {
			System.out.println("Nao houve vencedor");
		}
	}
	
}
