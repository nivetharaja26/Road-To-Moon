import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter a character : ");
        Scanner s=new Scanner(System.in);
        char ch=s.next().charAt(0);
        System.out.println(ch);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
            System.out.println("Alphabet");
        else
            System.out.println("Not a Alphabet");
    }
}