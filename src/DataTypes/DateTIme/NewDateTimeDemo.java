package DataTypes.DateTIme;

import java.time.Clock;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class NewDateTimeDemo {
    public static void main(String[] args) {

        // 3 overload of LocalDate.now method
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.now(Clock.systemDefaultZone());
        LocalDate localDate2 = LocalDate.now(ZoneId.of("Asia/Kolkata"));

        // we can define day using the following method, there is many other methods.
        LocalDate localDate3 = LocalDate.of(2020, Month.APRIL, 29);
        LocalDate localDate4 = LocalDate.parse("2020-02-23");

        // we can modify the LocalDate and get a new LocalDate object back, since its
        // immutable
        LocalDate localDate5 = localDate4.plusMonths(4);

        System.out.println(localDate4);

    }
}
