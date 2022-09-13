import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int v=1;
        for(int i=num;i>0;i--)
        {
            v=v*i;
        }
        System.out.print(v+" is a factorial");
    }
}