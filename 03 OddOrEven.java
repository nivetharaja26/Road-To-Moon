import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
       int n;
       Scanner s=new Scanner(System.in);
       n=s.nextInt();
       if(n%2==0)
        System.out.print("Even");
        else
            System.out.print("Odd");
    }
}