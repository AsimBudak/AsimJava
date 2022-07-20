package day06;

import java.util.Scanner;

public class C01_SwitchChase {
    public static void main(String[] args) {

        // kullanicidan sayi olarak kacinci ay oldugunu alip
        //istenen ay ismini yazdiranbir program yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci ay oldugunu girin");
        int ayNo= scan.nextInt();

        //if else erine switch chase yapisini kullanicaz

        switch (ayNo){
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Şubat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Ağustos");
                break;
            case 9:
                System.out.println("Eylül");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasım");
                break;
            case 12:
                System.out.println("Aralık");
                break;

            default:
                System.out.println("Lutfen gecerli bi ay numarasi girinniz");

                //switch icine yazilan variable lerin degerine gore
                //ilgili case'i ve break gorene kadar kodu calistirir
                //eger break yoksa ilgili case'den asagidogru tum case'ler calisir
                //if else'deki gibi son else gibi geriye kalan durumlari
                //tamamem kapsayacak bir satir daha ekleyebiliriz




        }





    }
}
