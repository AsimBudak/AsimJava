package day28_ImmutableClasses_DateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class C03_LocalDate {
    public static void main(String[] args) {

        LocalTime tm = LocalTime.now();
        System.out.println(tm);

        //bir islemin ne kadar surede bittigini bulmak istersek
        //islemden once ve sonra birer time objesi olusturup
        //aradaki farki hesaplayabiliriz
        int sayi = 0;
        for (int i = 0; i < 100000; i++) {
            sayi += i;
        }
        LocalTime tmLoopSonrasi = LocalTime.now();
        System.out.println(tmLoopSonrasi);
        double nanno1 = tm.getNano();
        double nano2 = tmLoopSonrasi.getNano();
        System.out.println("islem " + (nano2 - nanno1) + " nanosaniyede bitti");

        //ileri veya geri gidebiliriz
        System.out.println(tm.plusMinutes(1000));

        //istersek zone id kullanarak istedigimiz bolgenin saati icinde obje olusturabiliriz


    }
}
