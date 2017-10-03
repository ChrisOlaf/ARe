import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Administrator on 2.10.2017.
 */

public class Tanaan {

    public static void main(String[] args) {
        Date tanaan = new Date();
        Calendar tanaan2 = Calendar.getInstance();
        GregorianCalendar tanaan3 = new GregorianCalendar();
        LocalDate tanaan4 = LocalDate.now();
        LocalDateTime nyt = LocalDateTime.now();
        System.out.println("" + tanaan + "\n" + tanaan2 + "\n" + tanaan3 + "\n" + tanaan4 + "\n" + nyt);

        GregorianCalendar tammi = new GregorianCalendar(2017, Calendar.JANUARY, 1);
        Date tammi2 = tammi.getTime();
        System.out.println(tammi2);

        LocalDate tanaan5 = LocalDate.now();
        Date tamaPaiva = Date.from(tanaan5.atStartOfDay(ZoneId.systemDefault()).toInstant());
        System.out.println(tamaPaiva);

        //Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

    }



}
