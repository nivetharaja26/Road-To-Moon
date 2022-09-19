import java.util.*;
class HelloWorld {
    public static void main(String[] args)throws Exception {
        System.out.println("Enter number: ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        for(int i=1;i<num;i++)
        {
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}