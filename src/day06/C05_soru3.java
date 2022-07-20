package day06;

import java.util.Scanner;

public class C05_soru3 {
    public static void main(String[] args) {

        /*kullanicidan SDET kisaltmasindaki harflerinden birini yazmasini isteyin
        kullanici S girerse"Software"
        D girerse"Developer"
        E girerse "Êngineer"
        T girerse "In Testing" yazdirin
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen SDET kisaltmasinin harflerinden birini yaziniz");
        String str= scan.next();

        switch (str){
            case "S":
                System.out.println("Software");
                break;
            case "D":
                System.out.println("Developer");
                break;
            case "E":
                System.out.println("Engineer");
                break;
            case "T":
                System.out.println("In Testing");


        }



    }
}
