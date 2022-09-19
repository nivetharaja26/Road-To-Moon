import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter a low range : ");
        Scanner s=new Scanner(System.in);
        int p=s.nextInt();
        System.out.println("Enter a high range : ");
         int q=s.nextInt();int copy,res,inter;
        prime(p,q);
        
    }
    public static void prime(int x,int y){
        int low=x,high=y;
        int num;
        for(int j=low;j<high;j++){
          num=j;
        int prime=0;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
                prime=1;
        }
        if(prime!=1 && num!=1)
            System.out.println(num+" ");
        
      } 
    }
}