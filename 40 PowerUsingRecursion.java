import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter base : ");
        int base=s.nextInt();
        System.out.print("Enter power : ");
        int power=s.nextInt();
        
        System.out.print(calPower(base,power));
    }
    public static int calPower(int base, int power)
    {
        if(power>0)
            return (base* (calPower(base,power-1)));
    
        else
            return 1;
    }
    
}