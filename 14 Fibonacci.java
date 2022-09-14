import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter n : ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0,b=1,c;
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}