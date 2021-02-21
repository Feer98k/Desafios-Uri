package classes;

import java.util.Locale;
import java.util.Scanner;

public class uri1015 {

	public static void main(String[] args) {

        
        Locale.setDefault(Locale.US);
        Scanner a1 = new Scanner(System.in);
       
        float x,x2,y,y2,result,resultF;
       x=a1.nextFloat();
       y=a1.nextFloat();
       x2=a1.nextFloat();
       y2=a1.nextFloat();
       a1.close();
       result= (float)((Math.pow((x2-x), 2))+((Math.pow((y2-y), 2))));
       resultF=(float) Math.sqrt(result);
       String s = String.format("%.4f%n", resultF);
       resultF= Float.parseFloat(s);
        System.out.println(resultF);

	}

}
