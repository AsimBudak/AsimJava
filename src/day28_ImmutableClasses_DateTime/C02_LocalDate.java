package day28_ImmutableClasses_DateTime;

import java.time.LocalDate;

public class C02_LocalDate {
    public static void main(String[] args) {

        LocalDate trh=LocalDate.now();//objenin olusturuldugu tarihi trh ye assing eder
        LocalDate trh2=LocalDate.of(2003,10,27);
        //istedigimiz yil ay ve gun degerlerine gore bize obje olusturur

        System.out.println(trh);

        System.out.println(trh.getDayOfMonth());
        System.out.println(trh.getDayOfWeek());
        System.out.println(trh.getMonthValue());
        System.out.println(trh.getYear());

        //bir tarihten istedigimiz kadar ileri ya da geri gidebiliriz

        System.out.println(trh.minusWeeks(20));
        System.out.println(trh.plusMonths(9));

    }
}
