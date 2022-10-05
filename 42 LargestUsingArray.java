import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner s=new Scanner(System.in);
        int n[]={5,3,7,23,6,8};
        int largest=n[0];
        for(int f:n)
        {
            if(f>largest)
                largest=f;
        }
       
        System.out.print(largest);
    }
}