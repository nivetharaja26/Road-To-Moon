import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter decimal number : ");
        int n=s.nextInt();
        int rem;int dec=0;
        int i=1;
        while(n>0)
        {
            rem=n%8;
            dec=dec + rem* i;
            n=n/8;
            i=i*10;
        }
        System.out.print(dec);
    }
}