package day19_WhileLoop;

import java.util.Scanner;

public class C05_DoWhileLoop {
    public static void main(String[] args) {
        //kullanicidan toplamak uzere pozitif sayilar isteyin
        //islemi bitirmek icin 0'a basmasini soyleyin
        //kullanici yanlislikla negatif sayi girerse o sayiyi dikkate almayiin
        //ve "negatif sayi giremezsiniz" yazdirip basa donun
        //kullanici 0'a bastiginda toplam kac pozitif sayi girdigini
        //yanlislikla kac negatif sayi girdiigini
        //ve girdigi pozitif sayilarin toplaminn kac oldugunu yazdirin

        Scanner scan =new Scanner(System.in);
        int sayi=0;
        int toplam=0;

        do {
            System.out.println("lutfen pozitif bir tam sayi girin\nbitirmek icin 0'a basin ");
            sayi= scan.nextInt();
            if (sayi<0){
                System.out.println("negatif sayi giremezsiniz");
            } else if (sayi>0) {
                toplam+=sayi;
            }

        }while (sayi!=0);
        System.out.println("girilen sayilarin toplami :"+toplam);


    }
}
