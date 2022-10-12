import java.io.*;
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println(""); int r=2,c=2;
        
        int[][] tranmat=new int[c][r];
        int[][] mymat={{1,2},{3,4}};
       
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                tranmat[j][i]=mymat[i][j];
            }
        }
        
          for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(tranmat[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
