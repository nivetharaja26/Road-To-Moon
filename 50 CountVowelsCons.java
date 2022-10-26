import java.io.*;

class HelloWorld {
    public static void main(String[] args) {
       String input="Heloo";
       char in;int vow=0,cons=0;
       for(int i=0;i<input.length();i++)
       {
           in=input.charAt(i);
           if(in=='a' || in=='e' || in=='i' || in=='o' || in=='u')
           {
               vow=vow+1;
           }
           else
                cons=cons+1;
       }
       System.out.println("vowels= "+vow);
       System.out.println("consonants= "+cons);
    }
}
