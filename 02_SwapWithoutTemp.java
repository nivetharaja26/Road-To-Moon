class HelloWorld {
    public static void main(String[] args) {
        int a=5,b=7;
       
        System.out.print("before swaping");
        System.out.print("a="+a);
        System.out.print("b="+b);
        
        a=a-b;
        b=a+b;
        a=b-a;
        System.out.print("after swaping");
        System.out.print("a="+a);
        System.out.print("b="+b);
        
    }
}