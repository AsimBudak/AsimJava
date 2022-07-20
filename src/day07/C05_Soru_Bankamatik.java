package day07;

import java.util.Scanner;

public class C05_Soru_Bankamatik {
    public static void main(String[] args) {

        //bakiye(baslangic bakiyesi 1000tl) ogrenme, para yatırma ve cekme, cikis islemlerinin yapildig bir ATM app.

        Scanner scan = new Scanner(System.in);
        System.out.println("***");
        System.out.println("ATM'ye hosgeldiniz");
        System.out.println("Bakiye sorgulama için : 1\nPara cekme icin : 2\nPara yatırma icin : 3\ncıkıs : 4\nYapacagınız islemi seciniz");
        int islem=scan.nextInt();
        int bakiye=1000;

        switch (islem){
            case 1:
                System.out.println("Mevcut bakiyeniz : "+bakiye);
                break;
            case 2:
                System.out.println("Cekmek istediginiz miktari giriniz");
                int cekilenMiktar= scan.nextInt();
                if (cekilenMiktar>bakiye){
                    System.out.println("Bakiyeniz yetersiz");
                }else {
                    bakiye -= cekilenMiktar;
                    System.out.println("bakiyenizin guncel hali : "+bakiye);
                }
                break;
            case 3:
                System.out.println("Yatırmak istediginiz miktari giriniz");
                int yatırılanMiktar= scan.nextInt();
                bakiye+=yatırılanMiktar;
                System.out.println("bakiyenizin guncel hali : "+bakiye);
                break;
            case 4:
                System.out.println("cikisiniz yapilmistir hoccagal");
                break;




        }
    }
}
