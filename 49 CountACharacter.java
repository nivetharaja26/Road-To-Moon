import java.io.*;
import java.util.*;

public class HelloWorld{
    public static void main(String[] args) {
                String word="helo helo";
                char search='e';
                
                int count=0;
                
                for(int i=0;i<word.length();i++)
                {
                    if(search==word.charAt(i))  
                        count++;
                    
                }
                System.out.print(count);
                
        
    }
}
