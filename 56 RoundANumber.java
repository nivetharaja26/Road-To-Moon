import java.math.RoundingMode;
import java.text.DecimalFormat;

public class hello
{
    public static void main(String args[])
    {
        double num = 6.893345;
        
        DecimalFormat d=new DecimalFormat("#");
        
        d.setRoundingMode(RoundingMode.FLOOR);
        
        System.out.println(d.format(num));
    }
}
