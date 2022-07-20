package day23_Practice;

import java.util.Arrays;

public class C02_soru2 {
    public static void main(String[] args) {
        //dizi elemanlarinin ortalama degerini hesaplayan ve ortalamadan buyuk olan elemanlari yazdiran birkod yaziniz
        // input[]={1,2,3,4,5,6,7}

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int toplam = 0;


        for (int i = 0; i < arr.length; i++) {
         toplam += arr[i];

    }
        double ortalama= toplam/ arr.length;
        System.out.println("ortalama= "+ortalama);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>ortalama){
                System.out.println(arr[i]);
            }
        }






} }
