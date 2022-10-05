
class HelloWorld {
    public static void main(String[] args) {
    
        String reverse="Hello World";
        System.out.print(sentence(reverse));
        
    }
    public static String sentence(String reverse)
    {
        if(reverse.isEmpty())
            return reverse;
        return sentence(reverse.substring(1)) + reverse.charAt(0);
    }
}