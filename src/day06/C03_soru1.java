package day06;

import java.util.Scanner;

public class C03_soru1 {
    public static void main(String[] args) {
        //kllanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.println("Haftanin kacinci gunu?");
        int gun= scan.nextInt();

        switch (gun){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;

            default:
                System.out.println( "gecerli bir sayi giriniz");



        }




    }
}
