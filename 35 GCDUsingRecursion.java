import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
    
        Scanner s=new Scanner(System.in);
        int a,b;
        a=s.nextInt();
        b=s.nextInt();
        
        int gcd = rec(a,b);

        System.out.printf("G.C.D of %d and %d is %d.", a,b, gcd);
    }

    public static int rec(int a, int b)
    {
        if (b != 0)
            return rec(b,a%b);
        else
            return a;
    }
}