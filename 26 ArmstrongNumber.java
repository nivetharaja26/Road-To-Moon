import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        
        int copy=num;
        int res=0,inter;
        while(copy>0){
            inter=copy%10;
            res=res+inter*inter*inter;
            copy=copy/10;
        }
        if(res==num)
        {
            System.out.print("Armstrong Number");
            
        }
        else
            System.out.print("Not a Armstrong Number");
        
    }
}