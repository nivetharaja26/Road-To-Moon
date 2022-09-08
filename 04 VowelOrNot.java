import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
      char n;
       Scanner s=new Scanner(System.in);
     n = s.next().charAt(0);   
     
     if(n=='a' || n=='e' || n=='i' || n=='o' || n=='u')
        System.out.print("vowel");
    else
        System.out.print("Not a vowel");
    }
}