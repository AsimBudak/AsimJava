package day23_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class C05_soru5 {
    static List<String> urunListesi = new ArrayList<String>();
    static List<Double> urunFiyatlari = new ArrayList<Double>();
    static double toplamOdeme;
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        /*
         *basit bir 5 urunlu manav alisveris listesi programi yaziniz
         *
         * 1. adim: urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. adim: baska bir urun almak isteyip istemedigini sor
         *          istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir
         *          bu islemi alisverisi bitirmek isteyene kadar tamamla
         * 3. adim: musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle
         * 4. adim: alisveris bitince toplam odemesi gereken tutari goster
         *
         */
        urunListesi.add("domat -urun kodu: 1 ");
        urunListesi.add("muz -urun kodu: 2 ");
        urunListesi.add("elma -urun kodu: 3 ");
        urunListesi.add("erik -urun kodu: 4 ");
        urunListesi.add("cilek -urun kodu: 5 ");

        urunFiyatlari.add(15.0);
        urunFiyatlari.add(18.0);
        urunFiyatlari.add(8.0);
        urunFiyatlari.add(47.0);
        urunFiyatlari.add(27.0);

        System.out.println(urunListesi);
        musteriSecim();
    }
    private static void musteriSecim() {
        System.out.print("Sectiginiz urun kodunu giriniz : ");
        int secim = scan.nextInt();
        System.out.print("sectiginiz urunden kac kilo alacaksiniz : ");
        double kilo = scan.nextDouble();

        double urunTutari = kilo * urunFiyatlari.get(secim - 1);
        toplamOdeme+=urunTutari;
        System.out.println("alisvereise devam etmek istiyosanız 1 kasa icin 2 seciniz");
        int devam= scan.nextInt();
        if (devam==1){
            musteriSecim();
        }else
            kasa();
    }
    private static void kasa() {
        System.out.println("agam yine bakleriz sunu ode git : "+ toplamOdeme);
    }
}
