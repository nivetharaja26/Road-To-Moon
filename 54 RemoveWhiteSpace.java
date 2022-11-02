public class HelloWorld {

    public static void main(String[] args) {
        String sen= "h  e   ll    oo o";
        System.out.println("Original sentence: " + sen);

        sen = sen.replaceAll("\\s", "");
        System.out.println("After replacement: " + sen);
    }
}
