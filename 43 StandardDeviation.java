import java.io.*;
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       
       double[] input={2,7,4,9,1,5};
        double mean = (2+7+4+9+1+5)/6;
       double diff,sd=0,finalans;
       for(int i=0;i<6;i++)
       {
            
            diff=Math.pow(input[i]-mean , 2);
            sd=sd+diff;
           
       }
       finalans=Math.sqrt(sd);
       System.out.println(finalans);
    }
}