package day06;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class C04_soru2 {
    public static void main(String[] args) {
        /*kullanicidan bir sayi girmesini isteyiniz
        10 ise "iki basamakli en kucuk sayi"
        100 ise "uc basamakli en kucuk sayi"
        1000 ise "dort basamakli en kucuk sayi"
        diger durumlarda "girdigin sayiyi degistir" yzdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        switch (sayi){
            case 10:
                System.out.println("iki basamakli en kucuk sayi");
                break;
            case 100:
                System.out.println("uc basamakli en kucuk sayi");
                break;
            case 1000:
                System.out.println("dort basamakli en kucuk sayi");
                break;

            default:
                System.out.println("giridigin sayiyi degistir");



        }



    }
}
