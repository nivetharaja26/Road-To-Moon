import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int prime,pr;int flag=0;
        for(int i=2;i<num/2;++i)
        {
             System.out.println("i="+i);
          
                System.out.println("helo1");
                if(checkPrime(i))
                {
                    System.out.println("hii");
                    if(checkPrime(num-i))
                    {
                         System.out.print("helo3");
                        System.out.println("It can be expressed as Sum of prime numbers");
                        flag=1;
                    }
                }
                
            
        }
        if(flag!=1)
                System.out.print("Cannot be expressed");
    }
   static boolean checkPrime(int x)
    {
        System.out.print(x);
        int p=0;
        for(int j=2;j<x;j++){
            if(x%j==0)
            {
                p=1;
            }
        }
        if(p!=1)
        {
            System.out.print(" is prime");
            return true;
        }
        else
            return false;
    }
}