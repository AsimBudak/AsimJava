package day21_Arrrays;

import java.util.Arrays;

public class C05_sort {
    public static void main(String[] args) {
        //verlen bir arrayde en kucuk ve en buyuk degerleri yazdirin

        int arr[]={3,5,6,1,9,0,45,25,4,9,0};

        //sort methodu olmadan yapalim

        int enkucukSayi=Integer.MAX_VALUE; // arr[0]
        int enbuyukSayi=arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]<enkucukSayi){
                enkucukSayi=arr[i];
            }
            if (arr[i]>enbuyukSayi){
                enbuyukSayi=arr[i];
            }
        }
        System.out.println("arraydeki en kucuk sayi "+enkucukSayi);
        System.out.println("arraydeki en nuyuk sayi "+enbuyukSayi);

        Arrays.sort(arr);
        System.out.println("arraydeki en kucuk sayi "+arr[0]);
        System.out.println("arraydeki en nuyuk sayi "+arr[arr.length-1]);





    }
}
