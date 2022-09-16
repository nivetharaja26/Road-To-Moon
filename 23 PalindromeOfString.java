import java.io.*;
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Enter a String : ");
        Scanner s=new Scanner(System.in);
        
        String word=s.nextLine();
        String copy="";
        int len=word.length();
        
        for(int i=len-1;i>=0;i--)
        {
            copy=copy+word.charAt(i);
        }
        if(copy.equals(word))
            System.out.println("Palindrome");
        else
            System.out.print("Not a Palindrome");
        
    }
}