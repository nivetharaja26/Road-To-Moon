class HelloWorld {
    public static void main(String[] args) {
     //   System.out.println("Hello, World!");
     double a=8.3,b=3.5,c=5.5;
     
     double root1,root2;
     
     double determinant = b*b - 4*a*c;
     
     if (determinant > 0) {
         
      root1 = (-b + Math.sqrt(determinant)) / (2 * a);
      root2 = (-b - Math.sqrt(determinant)) / (2 * a);

      System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
    }
    
     else if (determinant == 0) {
         
      root1 = root2 = -b / (2 * a);
      System.out.format("root1 = root2 = %.2f;", root1);
    }

    
    else {

    
      double real = -b / (2 * a);
      double imaginary = Math.sqrt(-determinant) / (2 * a);
      System.out.format("root1 = %.2f+%.2fi", real, imaginary);
      System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
    }
     
    }
}