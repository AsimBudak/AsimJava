package day22_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("aykut");
        isimler.add("yusuf");
        isimler.add("ilker");
        isimler.add("oguzhan");
        System.out.println(isimler);

        isimler.set(1, "seckin");
        System.out.println(isimler);

        //daha onceden listede var olanlari da arsiv tutmak icin
        List<String>logListesi=new ArrayList<>();

        logListesi.add(isimler.set(2,"cosmos"));
        System.out.println(isimler);
        System.out.println(logListesi);


    }
}
