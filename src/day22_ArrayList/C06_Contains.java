package day22_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_Contains {
    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>();
        harfler.add("D");
        harfler.add("m");
        harfler.add(1,"T");
        harfler.add(0,"T");

        System.out.println(harfler);

        System.out.println(harfler.contains("T"));

        List<String> karakterler = new ArrayList<>();

        karakterler.add("M");
        karakterler.add("T");

        System.out.println(harfler.containsAll(karakterler));


    }

}
