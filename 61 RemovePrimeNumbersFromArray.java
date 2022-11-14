import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        
      
        System.out.print("Enter n:");
        
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        
       
        int j,flag,temp,l=0;
        for(int i=0;i<n;i++)
        {
            flag=0;
            
            for(j=2;j<a[i];j++)
            {
                if(a[i]%j==0)
                {
                    flag=1;
                    break;
                }
                
            }
            /*
            if(flag==1 && a[i]!=2)
            {
                int k=i;
                while(k<n-1)
                {
                temp=a[k];
                a[k]=a[k+1];
                k++;
                }
                n--;
            }
            **/
            
            if(flag==1)
            {
                b[l]=a[i];
                l++;
                
            }
        }
         for(int i=0;i<l;i++)
        {
            System.out.print(b[i]+" ");
        }
        
    }
}
