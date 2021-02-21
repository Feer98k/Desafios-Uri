package classes;


import java.util.Locale;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class uri1000 {
 
    public static void main(String[] args)  {
 
        Locale.setDefault(Locale.US);
        Scanner a1 = new Scanner(System.in);
         
    String A;
    double B,C,result;
    
    A=a1.nextLine();
    B=a1.nextDouble();
    C=a1.nextDouble();
    result=(C*0.15)+B;
 
   
   
    System.out.printf("TOTAL = R$ %.2f%n",result );

    a1.close();
      
        
            
       
    }
 
}
