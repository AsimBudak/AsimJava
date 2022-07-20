package day21_Arrrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {
        //kullaniciya kac elementlik bir array olusturcagini sorun
        //array'i olusturup elementleri kullanicidan alip, array'e atayin

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen kac elementli bir array istediginizi yazin");

        int uzunluk= scan.nextInt();

        int arr[]=new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.println("array icin "+(i+1)+". elemani girin");
            arr[i]= scan.nextInt();
        }

        System.out.println(Arrays.toString(arr));

    }
}
