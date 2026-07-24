package basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class TC05_current_time{

     public static void main(String[] args) {
        
        LocalDateTime current = LocalDateTime.now();
        
        DateTimeFormatter format1 =  DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        
        System.out.println(current.format(format1));
    }
}
