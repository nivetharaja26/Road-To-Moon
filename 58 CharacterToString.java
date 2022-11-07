class HelloWorld {
    public static void main(String[] args) {
        char ch='n';
        
        String str;
        
        str=Character.toString(ch);
        
        System.out.println(str);
        
        String str2;
    
        char[] ch2={'n','i','v'};
        
        str2=String.valueOf(ch2);
        
        System.out.println(str2);
        
        String str3=new String(ch2);
        
        System.out.println(str3);
        
    }
}
