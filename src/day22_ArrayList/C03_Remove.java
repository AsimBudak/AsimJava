package day22_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {

        List<Integer>sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(0,7);
        sayilar.add(2,7);

        sayilar.remove(3);
        //sayilar.remove(5);

        //sayilardan olusan bir listte objeyi vererek element silme methodu calismaz
        //sayi degeri girdigimizde java otomatik olarak sayiyi index kabul eder

       // int sayi =5;
       // sayilar.remove(sayi);
        Integer sayi=5;
        sayilar.remove(sayi);
        System.out.println(sayilar);





    }
}
