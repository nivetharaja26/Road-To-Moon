import java.io.*;
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt(); 
        System.out.print("Enter a exponential value  : ");
        int exp=s.nextInt(); 
       System.out.println("The power of the value is : "+Math.pow(num,exp));
    }
}