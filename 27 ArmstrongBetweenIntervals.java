import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter a low range : ");
        Scanner s=new Scanner(System.in);
        int p=s.nextInt();
        System.out.println("Enter a high range : ");
         int q=s.nextInt();int copy,res,inter;
     for(int i=p;i<q;i++)    {
         copy=i;
         res=0;
        while(copy>0){
            inter=copy%10;
            res=res+inter*inter*inter;
            copy=copy/10;
        }
        if(res==i)
        {
            System.out.print(res);
            
        }
}
        
    }
}