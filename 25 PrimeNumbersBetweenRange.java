import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter low range : ");
        Scanner s=new Scanner(System.in);
        int low=s.nextInt();
         System.out.println("Enter high range : ");
          int high=s.nextInt();int num;
      for(int j=low;j<high;j++){
          num=j;
        int prime=0;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
                prime=1;
        }
        if(prime!=1)
            System.out.println(num+" ");
        
      } 
    }
}