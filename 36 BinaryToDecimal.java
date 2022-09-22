import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter binary number : ");
        long n=s.nextLong();
        long rem;long dec=0;
        int i=0;
        while(n>0)
        {
            rem=n%10;
            dec=dec + rem* (long)Math.pow(2,i);
            n=n/10;
            i++;
        }
        System.out.print(dec);
    }
}