package day27_PassByValue;

import java.util.Arrays;

public class C01_PassByValue {
    public static void main(String[] args) {
 /*
 non primitive data turlerinde objenin kendisi degilde
 icindeki elementler degisirse
 java objenin referansi ve objenin kendisi degismedigi icin
 element degisikliklerini kabul eder ve kalici yapar
  */

        int arr[] = {1, 2, 3};
        System.out.println(Arrays.toString(arr));
        arrDegistir(arr);
        System.out.println("method call sonraasi : " + Arrays.toString(arr));
        arrDegistir(arr);

    }

    private static void arrDegistir(int[] arr) {

        arr[0] = 5;
        arr[1] = 6;
        System.out.println(Arrays.toString(arr));

    }
}
