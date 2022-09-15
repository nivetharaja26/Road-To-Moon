import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter n : ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int copy=n,count=0;
        while(copy>0)
        {
            copy=copy/10;
            count++;
        }
        System.out.print(count+" digits");
    }
}