import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IniciaMovimentoCodar {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Date data = format.parse("13/08/2022 15:42");
		System.out.println(format.format(data));
	}
}
