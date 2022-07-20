package day22_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_List {
    public static void main(String[] args) {

        // bir list olusturalim

        List<Integer> sayilarList=new ArrayList<>();
        System.out.println(sayilarList);

        sayilarList.add(5);
        sayilarList.add(3);
        sayilarList.add(0,7);
        sayilarList.add(2,7);
        System.out.println(sayilarList);



    }
}
