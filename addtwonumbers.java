import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        
        System.out.println("Enter a number one:");
        Scanner s=new Scanner(System.in);
        int input=s.nextInt();
         System.out.println("Enter a number two:");
          int input2=s.nextInt();
        System.out.println("After addition : "+(input+input2));
    }
}