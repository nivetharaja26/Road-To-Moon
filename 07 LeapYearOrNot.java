import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter Year:");
        Scanner s=new Scanner(System.in);
        int year=s.nextInt();

        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                    System.out.print("Leap Year");
                else
                    System.out.print("Not a Leap Year");
            }
            else
            {
                System.out.print("Leap Year");
            }
        }
        else{
            System.out.print("Not a Leap Year");
        }
    }
}