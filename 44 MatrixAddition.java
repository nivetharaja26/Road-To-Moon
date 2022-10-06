import java.io.*;
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       
     Scanner s=new Scanner(System.in);
     
     int row,column; 
     
    System.out.print("Enter row size : ");
    row=s.nextInt();
    
    System.out.print("Enter column size : ");
    column=s.nextInt();
    
    
    int[][] twod=new int[row][column];

int[][] twod2=new int[row][column]; int[][] ans=new int[row][column]; 
int i,j;  
    for(i=0;i<row;i++)
    {
        for(j=0;j<column;j++)
        {
            System.out.println("Enter element of first array : ");
            twod[i][j]=s.nextInt();
        }
    }
    
     for(i=0;i<row;i++)
    {
        for(j=0;j<column;j++)
        {
            System.out.println("Enter element of second array : ");
            twod2[i][j]=s.nextInt();
        }
    }
     
    for(i=0;i<row;i++)
        for(j=0;j<column;j++)
        {
            ans[i][j]=twod[i][j]+twod2[i][j];
        }
    for(i=0;i<row;i++)
    for(j=0;j<column;j++)
    {
        System.out.println(ans[i][j]);
    }
    }
}