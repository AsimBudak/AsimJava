package day07;

import java.util.Scanner;

public class C04_Practice {
    public static void main(String[] args) {

        //kullanicidan yasadigi gune gore 100 gun sonra hangi gun oldugunu yazdiriniz
        //pazartesi hafta baslagici
        Scanner scan= new Scanner(System.in);
        System.out.println("pazartesi:1\nsali:2\ncarsamba:3\npersembe:4\ncuma:5\ncumartesi:6\npazar:7\nlufen haftanin kacinci gununde oldugunuzu giriniz");
        int gun= scan.nextInt();
        System.out.println("kac gun sonrasini ogrenmek istiyosun");
        int kacGunSonra=scan.nextInt();
        int bulunanGun=(kacGunSonra%7+gun)%7;

        if (gun>0 && gun<=7) {


            switch (bulunanGun) {
                case 1:
                    System.out.println(kacGunSonra + "gun sonra gunlerden pazartesi");
                    break;
                case 2:
                    System.out.println(kacGunSonra + "gun sonra gunlerden sali");
                    break;
                case 3:
                    System.out.println(kacGunSonra + "gun sonra gunlerden carsamba");
                    break;
                case 4:
                    System.out.println(kacGunSonra + "gun sonra gunlerden persembe");
                    break;
                case 5:
                    System.out.println(kacGunSonra + "gun sonra gunlerden cuma");
                    break;
                case 6:
                    System.out.println(kacGunSonra + "gun sonra gunlerden cumartesi");
                    break;
                case 0:
                    System.out.println(kacGunSonra + "gun sonra gunlerden pazar");
                    break;
                default:
                    System.out.println("gecerli gun gir usta");


            }

        }else System.out.println("hatali veri girdiniz");



    }
}
