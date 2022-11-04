import java.util.Arrays;

public class arr{
    public static void main(String args[])
    {
        int[] a1={4,5,6,7},a2={7,8,9,2,3,4};
        
        int lena1=a1.length;
        int lena2=a2.length;
        
        int[] resarr=new int[lena1 + lena2];
        
        System.arraycopy(a1,0,resarr,0,lena1);
        System.arraycopy(a2,0,resarr,lena1,lena2);
        
        System.out.print(Arrays.toString(resarr));
    }
}
