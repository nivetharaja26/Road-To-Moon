import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class time
{
    public static void main(String args[])
    {
        String mystr="2022-06-23";
        LocalDate date=LocalDate.parse(mystr,DateTimeFormatter.ISO_DATE);
        System.out.println(date);
    }
}
