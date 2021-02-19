import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class TesteCalendarioEx9 {

	public static void main(String[] args) {

		CalendarioEx9 calendario = new CalendarioEx9();

		Calendar cal = Calendar.getInstance();

		Date d = new Date();

		cal.setTime(d);
		
		calendario.setDia(cal.get(Calendar.DAY_OF_MONTH));
		calendario.setMes(cal.get(Calendar.MONTH) +1);
		calendario.setAno(cal.get(Calendar.YEAR));

		if (calendario.getMes() >= 10) {
			System.out.println(
					"Data atual: " + calendario.getDia() + "/" + calendario.getMes() + "/" + calendario.getAno());
		} else {
			System.out.println(
					"Data atual: " + calendario.getDia() + "/0" + calendario.getMes() + "/" + calendario.getAno());
		}

		switch (calendario.getMes()) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;
		}
		
		calendario.setHora(cal.get(Calendar.HOUR));
		calendario.setMin(cal.get(Calendar.MINUTE));
		
		if (calendario.getHora() < 10) {
			System.out.print("Hora atual: 0" + calendario.getHora());
		} else {
			System.out.print("Hora atual: " + calendario.getHora());
		}
		
		
		if (calendario.getMin() < 10) {
			System.out.print(":0" + calendario.getMin());
		} else {
			System.out.print(":" + calendario.getMin());
		}
	}
}
