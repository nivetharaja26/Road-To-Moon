import java.io.*;
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int copy=num,c;
        int reverse=0;
        while(copy>0)
        {
            c=copy%10;
            reverse=reverse*10+c;
            copy=copy/10;
        }
        System.out.println("The reversed number is : "+reverse);
        
    }
}