package day22_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("aykut");
        isimler.add("yusuf");
        isimler.add("ilker");
        isimler.add("oguzhan");
        System.out.println(isimler);

        boolean sonuc = isimler.remove("oguzhan");

        if (sonuc == true) {
            System.out.println("isim silindi");
        } else {
            System.out.println("isim yokki babuşs");
        }


        System.out.println(isimler);

        isimler.remove("berk");
        if (sonuc == true) {
            System.out.println("isim silindi");
        } else {
            System.out.println("isim yokki babuşs");
        }

    }
}
