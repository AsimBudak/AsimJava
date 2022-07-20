package day06;

import java.util.Scanner;

public class C06_soru4 {
    public static void main(String[] args) {
        //kullanicidan gun ismi alip haftasonu ya da haftaici yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("bir gun ismi giriniz");
        String str= scan.next();

        switch (str){
            case "pazartesi":
                System.out.println("haftaici");
                break;
            case "sali":
                System.out.println("haftaici");
                break;
            case "carsamba":
                System.out.println("haftaici");
                break;
            case "persembe":
                System.out.println("haftaici");
                break;
            case "cuma":
                System.out.println("haftaici");
                break;
            case "cymartesi":
                System.out.println("haftasonu");
                break;
            case "pazar":
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("gecerli bir gun giriniz");


        }




    }
}
