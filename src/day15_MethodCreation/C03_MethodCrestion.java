package day15_MethodCreation;

import java.util.Scanner;

public class C03_MethodCrestion {
    public static void main(String[] args) {
        //kullanicidan bir kelime isteyin
        //eger kelime 3 harften kisa ise "kelime cok kisa" yazdirin
        //eger kelime 3,4 veya 5 harfli ise harf sayisini ve
        //kelimenin tersten yazdirisini yazdirin
        //eger 5 harften uzunsa "kelime cok uzun "yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime girinz");
        String kelime = scan.next();
        int harfSayisi=kelime.length();

        if (harfSayisi<3){
            System.out.println("kelime cok kisa");
        }else if (harfSayisi==3){
            ucHarfiTersineCevir();
        }else if (harfSayisi==4){
            dortHarfiTersineCevir();
        }else if (harfSayisi==5){
            bestHarfiTersineCevir();
        }else {
            System.out.println("kelime cok uzun");
        }
    }

    private static void bestHarfiTersineCevir() {
    }

    private static void dortHarfiTersineCevir() {
    }

    private static void ucHarfiTersineCevir() {
    }

}



