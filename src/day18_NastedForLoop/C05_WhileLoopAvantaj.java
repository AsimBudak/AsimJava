package day18_NastedForLoop;

import java.util.Scanner;

public class C05_WhileLoopAvantaj {
    public static void main(String[] args) {
        //kullanicidan istedigi kaar sayi girmesini isteyin
        //kullanicinin girdigi sayilar 500'u gecerse
        //artik eter cok sayi girdin, toplam .... oldu yazsin

        Scanner scan = new Scanner(System.in);

        int sayi=0;
        int toplam=0;

        while (toplam<500){
            System.out.println( "lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;

        }
        System.out.println("artık eter cok sayi girdin, girdigin sayilarin toplami: "+toplam+" oldu");


    }
}
