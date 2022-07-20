package day22_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C09_ListedenTekrarliElementleriSilme {
    public static void main(String[] args) {

        //verilen bir listede tekrar eden sayilari sadece 1 kere yazdiran
        //bir method olusturun

        List<Integer>sayilar=new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        tekrarsizListeOlustur(sayilar);



    }

    private static void tekrarsizListeOlustur(List<Integer> sayilar) {

        List<Integer>tekrarsizList=new ArrayList<>();

        for (int i = 0; i < sayilar.size(); i++) {
            if (!tekrarsizList.contains(sayilar.get(i))){
                 tekrarsizList.add(sayilar.get(i));

            }

        }
        System.out.println(tekrarsizList);
    }
}
