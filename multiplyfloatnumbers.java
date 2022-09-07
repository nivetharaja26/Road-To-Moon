import java.util.*;
class HelloWorld {
    public static void main(String[] args) throws Exception{
        
     
        Scanner s=new Scanner(System.in);
        
        float input=5f;
        System.out.println("The number one is "+input);
        System.out.println("Enter a number two:");
        float input2=s.nextFloat();
        System.out.println("After addition : "+(input*input2));
    }
}