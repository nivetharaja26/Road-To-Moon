import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter two numbers : ");
        Scanner s=new Scanner(System.in);
        
        int n1=s.nextInt();
        int n2=s.nextInt();
        
        int LCM = (n1>n2)?n1:n2;
        
        while(true)
        {
            if(LCM%n1==0 && LCM%n2==0)
            {
                System.out.print(LCM+" is the LCM");
                break;
            }
            ++LCM;
        }
    }
}