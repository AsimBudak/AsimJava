package day21_Arrrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        int arr[]; // deger atamasi yapmadik ama java kabul etti ancak kullanmamiza izin veermez

        arr = new int[6];
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);//String deki lenght(), bunda yok

        //arraydeki her bir elemani şndex degeri kadar arttiralim

        for (int i = 0; i < arr.length; i++) {
            arr[i] += i;

        }
        System.out.println(Arrays.toString(arr));
    }
}
