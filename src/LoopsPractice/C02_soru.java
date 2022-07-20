package LoopsPractice;

import java.util.Locale;
import java.util.Scanner;

public class C02_soru {
    public static void main(String[] args) {
         // saati saniyeye, mil'i kılometreye ,kilogrami grama ceviren bir method yaziniz

        Scanner scan=new Scanner(System.in);
        System.out.println("ceviri yapacaginiz islemi seciniz");
        String islem= scan.next().toLowerCase(Locale.ROOT);
        System.out.println("cevirim miktarini giriniz : ");
        double miktar =scan.nextDouble();
        donustur(islem,miktar);



    }

    private static void donustur(String islem, double miktar) {
        switch (islem){
            case "saat" :
                System.out.println("merak ettigin saat "+(miktar*60*60)+" saniyedir");
                break;

            case "mil":
                System.out.println("merak ettigin mil "+(miktar*1.61)+" kilometredir");
                break;
            case "kilogram":
                System.out.println("merak ettigin kilogram "+(miktar*60*60)+" gramdir");
                break;
            default:
                System.out.println("agam bizimle eglenir");
        }
    }
}
