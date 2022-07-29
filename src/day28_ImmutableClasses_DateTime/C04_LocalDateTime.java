package day28_ImmutableClasses_DateTime;

import java.time.LocalDateTime;

public class C04_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println(tarihSaat);
        System.out.println(tarihSaat.plusYears(3).plusMonths(2).plusDays(10).plusHours(5).plusMinutes(5));


    }
}
