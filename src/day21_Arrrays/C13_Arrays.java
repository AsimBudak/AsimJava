package day21_Arrrays;

import java.util.Arrays;

public class C13_Arrays {
    public static void main(String[] args) {
        //verilen arraye yeni bir element ekleyen bir method olusturun

        int arr[]={3,5,7};

        //arr[3]=8; arrayda olmayn bir bir indexe atama yapamayiz

        //arr={1,3,5]; var olan bir arraye ayni boyutta bile olsa direkt yenidegerler iceren bir atama yapamayiz

        arr=new int[4];
        System.out.println(Arrays.toString(arr));

        int arrYeni[]=new int[5];

        arr=arrYeni;
        System.out.println(Arrays.toString(arr));

        arrYeni[0]=2;
        arrYeni[3]=5;


        arr=arrYeni;
        System.out.println(Arrays.toString(arr));

        //bir arraye icinde hazir elementlerin oldugu yeni bir array atamak isterseniz
        //bunu {1,2,3} seklinde yazarak degil
        //new int[3] diyerek olustrup sonra deger atayarak tamamladigimiz bir arrayi
        //assign ederek yapabiliriz





    }
}
