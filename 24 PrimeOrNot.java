import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        
        int prime=0;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
                prime=1;
        }
        if(prime==1 || num==1)
        {
            System.out.println("It is not a Prime number");
            
        }
        else{
            System.out.println("It is a prime number");
        }
        
    }
}