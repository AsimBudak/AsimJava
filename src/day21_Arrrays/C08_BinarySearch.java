package day21_Arrrays;

import java.util.Arrays;

public class C08_BinarySearch {
    public static void main(String[] args) {

        int arr[] = {3, 5, 6, 1, 9, 0, 45, 25, 4, 9, 0};

        int istenenSayi = 10;
        // eger javadan hazie binerySearch ile yapmak isterseniz
        //once sart methodunu kullanip, sonra binarsearch yapmamiz lazım
        //binerySearch() bize istenen sayinin oldugu indexi verir

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,istenenSayi));

        //eger olmayan birelementi aratirsak
        //java bulamadigini gostermek icin - isareti koyar
        //sonrada o sayi olsaydi siralamasi ne olacak ise o sirayi bşze verir



    }
}
