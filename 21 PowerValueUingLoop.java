import java.io.*;
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt(); //3
        System.out.print("Enter a exponential value  : ");
        int exp=s.nextInt(); //2
        int res=1;
        while(exp>0)
        {
            res=res*num;
            exp--;
        }
       System.out.println("The power of the value is : "+res);
    }
}