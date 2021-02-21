package classes;


import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class uri1061 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		short dia1,dia2,hora1,hora2,minuto1,minuto2,segundos1,segundos2;
		String day=s.next();
		dia1=s.nextShort();
		hora1=s.nextShort();
		day=s.next();
		minuto1=s.nextShort();
		day=s.next();
		segundos1=s.nextShort();
		day=s.next();
		dia2=s.nextShort();
		hora2=s.nextShort();
		day=s.next();
		minuto2=s.nextShort();
		day=s.next();
		segundos2=s.nextShort();
		s.close();
		LocalTime d1 = LocalTime.of(hora1, minuto1, segundos1);
		LocalTime d2 = LocalTime.of(hora2, minuto2, segundos2);
		
		LocalTime d3= LocalTime.of((ChronoUnit.HOURS.getDuration().between(d1, d2)));
		
		
	}

}
