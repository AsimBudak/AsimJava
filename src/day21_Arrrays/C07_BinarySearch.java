package day21_Arrrays;

import java.util.Arrays;

public class C07_BinarySearch {
    public static void main(String[] args) {
        int arr[] = {3, 5, 6, 1, 9, 0, 45, 25, 4, 9, 0};
        //verilen arrayde istenen bir elementin var olup olmadigini true/false uazdirarak
        //gosteren bir method olusturun

        int istenenSayi = 100;

        istenenElelmanVarMi(arr, istenenSayi);
        // eger javadan hazie binerySearch ile yapmak isterseniz
        //once sart methodunu kullanip, sonra binarsearch yapmamiz lazım

    }

    private static void istenenElelmanVarMi(int[] arr, int istenenSayi) {
        boolean sonuc = false;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == istenenSayi) {
                sonuc = true;
                break;
            }

        }

    }
}
