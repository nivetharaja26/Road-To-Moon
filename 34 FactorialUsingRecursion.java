import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter n  : ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        long factorial = mulNum(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static long mulNum(int num)
    {
        if (num >= 1)
            return num * mulNum(num - 1);
        else
            return 1;
    }
}