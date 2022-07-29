package day28_ImmutableClasses_DateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_IkiTarihArasiniBulma {
    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();
        LocalDate dogumGunu=LocalDate.of(2003,10,27);
        System.out.println(Period.between(dogumGunu,bugun));



    }
}
