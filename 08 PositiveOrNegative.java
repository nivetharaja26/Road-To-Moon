import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter a Number : ");
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        if(number>0)        
        {
            System.out.print("Positive Number");
        }
        else{
            System.out.print("Negative Number");
        }
        
        
    }
}