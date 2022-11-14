import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        LocalDateTime t=LocalDateTime.now();
        
        DateTimeFormatter formater=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String formatted=t.format(formater);
        
        
        System.out.print(t);
        System.out.print(formatted);
    }
}
