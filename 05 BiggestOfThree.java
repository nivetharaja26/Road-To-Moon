import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
     
       Scanner s=new Scanner(System.in);
    int  n = s.nextInt();   
     int o = s.nextInt();
     int p=s.nextInt();
        
        if(n>=o && n>=p)
            System.out.print(n+"is big");
        else if(o>=n && o>=p)
            System.out.print(o+"is big");
        else
            System.out.print(p+"is big");
    }
}