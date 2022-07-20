package day07;

import java.util.Scanner;

public class C03_switchCasePractice {
    public static void main(String[] args) {

        //girilen bir ay numarasina gore ayin kac gun oldugunu sayi ile yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("yilin kacinci ayini ogrenmek istiryorsunuz");
        int ay =scan.nextInt();

        switch (ay){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("girdiginiz ayda 31 gun var");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("girdiginiz ayda 30 gun var");
                break;
            case 2:
                System.out.println("lutfen bulundugunuz yili giriniz");
                int yıl=scan.nextInt();
                if (yıl%4==0){
                    System.out.println("girdiginiz ayda 29 gun vardir");
                }else System.out.println("girdiginiz ayda 28 gun vardir");

break;
            default:
                System.out.println("sen neyditon gardas 12 ay var");

        }




    }
}
