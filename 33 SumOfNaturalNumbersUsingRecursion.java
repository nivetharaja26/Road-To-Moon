import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
         int sum = sumNatural(num);
        System.out.println("Sum = " + sum);
    }

    public static int sumNatural(int num) {
        if (num != 0)
            return num + sumNatural(num - 1);
        else
            return num;
    }
    
}