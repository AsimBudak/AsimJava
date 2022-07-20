package day21_Arrrays;

import java.util.Arrays;

public class C06_BuyuktenKucugeSiralama {
    public static void main(String[] args) {
        //verilen bir arrayi buyukten kucuge siralayip yazdiran bir method olusturun
        int arr[]={3,5,6,1,9,0,45,25,4,9,0};

        tersrenSirala(arr);

    }

    public static void tersrenSirala(int[] arr) {

        Arrays.sort(arr);
        int tersArr[]=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            tersArr[i]=arr[arr.length-1-i];

        }
        System.out.println(Arrays.toString(tersArr));
    }
}
