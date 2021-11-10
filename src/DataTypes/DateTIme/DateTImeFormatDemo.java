package DataTypes.DateTIme;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTImeFormatDemo {
    public static void main(String[] args) {
        LocalDateTime localDateTime= LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yy hh:mm:ss");

        System.out.println(localDateTime.format(dateTimeFormatter));
    }
}
