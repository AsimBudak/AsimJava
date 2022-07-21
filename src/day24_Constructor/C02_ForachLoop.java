package day24_Constructor;

import java.util.ArrayList;
import java.util.List;

public class C02_ForachLoop {
    public static void main(String[] args) {

        //10 elementli bir list olusturalim

        int arr[] = {2, 5, 4, 6, 4, 9, 7, 1, 3, 10};

        List<Integer> sayilar = new ArrayList<>();

        for (int each : arr
        ) {
            sayilar.add(each);
        }


    }
}
