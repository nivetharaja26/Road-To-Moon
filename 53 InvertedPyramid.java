import java.util.*;
class main{
   public static void main(String args[]){
   int i,j,space,row,k;
   Scanner s = new Scanner(System.in);
   System.out.print("enter the row:");
   row = s.nextInt();
   for(i=row;i>=1;i--)
{

       for(space=row-i;space>=1;space--)
            System.out.print(" ");
           
            for(k=0;k!=2*i-1;k++)
                 System.out.print("*");
    System.out.print("\n");

}}
}
