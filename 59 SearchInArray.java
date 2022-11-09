
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        int[] num={1,2,3,4,5};
        int search=5;
        int count=0;
        for(int i=0;i<num.length;i++)
        {
            if(num[i]==search)
            {
                count=1;
                break;
            }        
        }
        if(count==1)
        {
            System.out.println("Found");
            
        }
        else
            System.out.println("Not Found");
        
    }
}
