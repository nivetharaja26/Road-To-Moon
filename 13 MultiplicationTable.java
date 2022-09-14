import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter number for table : ");
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        for (int i=1;i<=10;i++)
        {
            System.out.println(i+"*"+num+"="+i*num);
        }
    }
}