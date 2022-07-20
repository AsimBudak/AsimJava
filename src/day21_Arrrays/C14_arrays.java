package day21_Arrrays;

import java.util.Arrays;

public class C14_arrays {
    public static void main(String[] args) {
        //verilen bir arraye yenibir element ekleyen method olusrurun

        int arr[] = {3, 5, 7};
        int eklenecekElement = 4;

        arr = arrayeElemanEkle(arr, eklenecekElement);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] arrayeElemanEkle(int[] arr, int eklenecekElement) {

        int yeniArray[]=new int[(arr.length)+1];

        for (int i = 0; i < arr.length; i++) {
            yeniArray[i]=arr[i];

        }

yeniArray[yeniArray.length-1]=eklenecekElement;
        return yeniArray;
    }
}
