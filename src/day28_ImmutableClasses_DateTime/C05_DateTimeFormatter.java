package day28_ImmutableClasses_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println(tarihSaat);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/M/YYYY");

        System.out.println(formatter.format(tarihSaat));

        /*
        format olustururken
        GUN
        d: basta 0 varsa onu yazmadan gun numarasi
        dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
        DDD: yilin kacinci gunu oldugunu yazar
        E, EE, EEE: gun isminin ilk 3 harfi
        EEEE: gun isminin tamamini

        AY (Ay icin M, dakika icin m kullanilir)
        M: basta 0 varsa onu yazmadan ay numarasi
        MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
        MMM: Ay isminin ilk uc harfi
        MMMM: ay isminin tamami

        YY: yilin son iki rakamini
        YYYY: yilin tamamini
         */


    }
}
