package Projects;

import java.util.Scanner;

public class UcusProjesi {
    public static void main(String[] args) {
        /*
        A sehrinden ucmak isteyen bir yolcu B sehrine 500km C sehrine 700km D shrine 900km mesafededir
        Bilet tarifesi : 0.10$
        yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
        12 ve 24 yas arasindaysa %10 indirm,
        65 yasindan buyukse %30 indirim,
        bilet gidis donus alinirsa %20 indirim uygulayan bir app create ediniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("hos geldin agam nereye gidecen\n B C D ");
        String city = scan.next().toUpperCase();
        System.out.println("ucusunuz icin\n tek yon -->1\n cift yon -->\n giriniz : ");
        int flytype = scan.nextInt();
        System.out.println("yasinida gir agam : ");
        int age = scan.nextInt();
        double priceC = 0.10 * 700;
        double priceB = 0.10 * 500;
        double priceD = 0.10 * 900;

        if (city.equals("B") || city.equals("C") || city.equals("D")) {

            if (age > 65) {
                if (city.equals("B")) {
                    if (flytype == 1) {

                        System.out.println("    *****    ");
                        System.out.println("ucusunuz icin bilet odemeniz : " + (priceB * 0.7) + "$");

                    } else if (flytype == 2) {

                        System.out.println("    *****    ");
                        System.out.println("ucusunuz icin bilet odemeniz : " + (priceB * 0.7 * 0.8 * 2) + "$");

                    } else System.out.println("hatali veri girdiniz");

                } else if (city.equals("C")) {
                    if (flytype == 1) {

                        System.out.println("    *****    ");
                        System.out.println("ucusunuz icin bilet odemeniz : " + (priceC * 0.7) + "$");

                    } else if (flytype == 2) {

                        System.out.println("    *****    ");
                        System.out.println("ucusunuz icin bilet odemeniz : " + (priceC * 0.7 * 0.8 * 2) + "$");

                    } else System.out.println("hatali veri girdiniz");

                } else if (city.equals("D")) {
                    if (flytype == 1) {

                        System.out.println("    *****    ");
                        System.out.println("ucusunuz icin bilet odemeniz : " + (priceD * 0.7) + "$");

                    } else if (flytype == 2) {

                        System.out.println("    *****    ");
                        System.out.println("ucusunuz icin bilet odemeniz : " + (priceD * 0.7 * 0.8 * 2) + "$");

                    } else System.out.println("hatali veri girdiniz");

                }

            } else if (age >= 12 && age < 24) {
                if (city.equals("B")) {
                    if (flytype == 1) {

                        System.out.println("    *****    ");
                        System.out.println("ucusunuz icin bilet odemeniz : " + (priceB * 0.9) + "$");

                    } else if (flytype == 2) {

                        System.out.println("    *****    ");
                        System.out.println("ucusunuz icin bilet odemeniz : " + (priceB * 0.9 * 0.8 * 2) + "$");

                    } else System.out.println("hatali veri girdiniz");

                } else if (city.equals("C")) {
                    if (flytype == 1) {

                        System.out.println("    *****    ");
                        System.out.println("ucusunuz icin bilet odemeniz : " + (priceC * 0.9) + "$");

                    } else if (flytype == 2) {

                        System.out.println("    *****    ");
                        System.out.println("ucusunuz icin bilet odemeniz : " + (priceC * 0.9 * 0.8 * 2) + "$");

                    } else System.out.println("hatali veri girdiniz");

                } else if (city.equals("D")) {
                    if (flytype == 1) {

                        System.out.println("    *****    ");
                        System.out.println("ucusunuz icin bilet odemeniz : " + (priceD * 0.9) + "$");

                    } else if (flytype == 2) {

                        System.out.println("    *****    ");
                        System.out.println("ucusunuz icin bilet odemeniz : " + (priceD * 0.9 * 0.8 * 2) + "$");

                    } else System.out.println("hatali veri girdiniz");

                }

            } else if (age < 12) {
                if (city.equals("B")) {
                    if (flytype == 1) {

                        System.out.println("    *****    ");
                        System.out.println("ucusunuz icin bilet odemeniz : " + (priceB * 0.5) + "$");

                    } else if (flytype == 2) {

                        System.out.println("    *****    ");
                        System.out.println("ucusunuz icin bilet odemeniz : " + (priceB * 0.5 * 0.8 * 2) + "$");

                    } else System.out.println("hatali veri girdiniz");

                } else if (city.equals("C")) {
                    if (flytype == 1) {

                        System.out.println("    *****    ");
                        System.out.println("ucusunuz icin bilet odemeniz : " + (priceC * 0.5) + "$");

                    } else if (flytype == 2) {

                        System.out.println("    *****    ");
                        System.out.println("ucusunuz icin bilet odemeniz : " + (priceC * 0.5 * 0.8 * 2) + "$");

                    } else System.out.println("hatali veri girdiniz");

                } else if (city.equals("D")) {
                    if (flytype == 1) {

                        System.out.println("    *****    ");
                        System.out.println("ucusunuz icin bilet odemeniz : " + (priceD * 0.5) + "$");

                    } else if (flytype == 2) {

                        System.out.println("    *****    ");
                        System.out.println("ucusunuz icin bilet odemeniz : " + (priceD * 0.5 * 0.8 * 2) + "$");

                    } else System.out.println("hatali veri girdiniz");

                } else if (age >= 24 && age < 65) {
                    if (city.equals("B")) {
                        if (flytype == 1) {

                            System.out.println("    *****    ");
                            System.out.println("ucusunuz icin bilet odemeniz : " + (priceB) + "$");

                        } else if (flytype == 2) {

                            System.out.println("    *****    ");
                            System.out.println("ucusunuz icin bilet odemeniz : " + (priceB * 0.8 * 2) + "$");

                        } else System.out.println("hatali veri girdiniz");

                    } else if (city.equals("C")) {
                        if (flytype == 1) {

                            System.out.println("    *****    ");
                            System.out.println("ucusunuz icin bilet odemeniz : " + (priceC) + "$");

                        } else if (flytype == 2) {

                            System.out.println("    *****    ");
                            System.out.println("ucusunuz icin bilet odemeniz : " + (priceC * 0.8 * 2) + "$");

                        } else System.out.println("hatali veri girdiniz");

                    } else if (city.equals("D")) {
                        if (flytype == 1) {

                            System.out.println("    *****    ");
                            System.out.println("ucusunuz icin bilet odemeniz : " + (priceD) + "$");

                        } else if (flytype == 2) {

                            System.out.println("    *****    ");
                            System.out.println("ucusunuz icin bilet odemeniz : " + (priceD * 0.8 * 2) + "$");

                        } else System.out.println("hatali veri girdiniz");

                    }


                }


            } else System.out.println("agam henuz o gezegene ucus yok :)");


        }
    }
}