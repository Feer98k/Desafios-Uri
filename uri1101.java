package classes;

import java.util.Scanner;

public class uri1101 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		short m=1,n=1,sum=0;
		
		do {
			m=s.nextShort();
			n=s.nextShort();
			if(m<=0 ||n<=0) {
				break;
			}
			if(m>0 && n>0&& m<n) {
				for (short i = m; i<=n; i++) {
					System.out.printf("%d ",i);
					sum+=i;
					
				}System.out.printf("Sum=%d\n",sum);	
				sum=0;
			}
			if(m>0 && n>0&&m>n) {
				for (short i = n; i<=m; i++) {
					System.out.printf("%d ",i);
					sum+=i;
					
				}System.out.printf("Sum=%d\n",sum);	
				sum=0;
			}
		}
		while(m>=0 &&n>=0);
		s.close();
	}

}
