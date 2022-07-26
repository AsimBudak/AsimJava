package day19_WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class C01_SayiBulmaca {
    public static void main(String[] args) {
        //bilgisayara 1 ile 100 arasinda bir sayi tutturun
        //kullanicidan bu sayiyi tahmin etmesini isteyin
        //girilen her tahminde sayiyi buyut veya kucult diye kullaniciye yol gosterin
        //kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdiri

        Random rnd = new Random();
        int sayi = rnd.nextInt(100); //nurasi 100'den kucuk rastgele bir sayi olusturur

        Scanner scan = new Scanner(System.in);
        int tahmin = 0;
        int sayac = 0;

        while (sayi != tahmin) {
            System.out.println("lutfen bir sayi giriniz");
            tahmin = scan.nextInt();

            if (tahmin > sayi) {
                System.out.println("daha kucuk bir sayi soylemelisin");

            } else if (tahmin < sayi) {
                System.out.println("daha buyuk bir sayi soylemelisin");

            }
            sayac++;
        }

        System.out.println("tuttugum sayiyi " + (sayac-1 )+ " tahminde buldunuz");

    }
}
