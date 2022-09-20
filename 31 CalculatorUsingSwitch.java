import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.print("+ - * /");
        System.out.println("Choose your operation : ");
        Scanner s=new Scanner(System.in);
        char op=s.next().charAt(0);
        System.out.print("Enter first operand");
        int p=s.nextInt();
        System.out.print("Enter second operand");
        int q=s.nextInt();
        
        switch(op){
            case '+':
                System.out.println(p+q);
                break;
            case '-':
                System.out.println(p-q);
                break;
            case '*':
                System.out.println(p*q);
                break;
            case '/':
                System.out.println(p/q);
                break;
        }
    }
}