package day17_ForLoop;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 100'denkucuk bir tamsayi giriniz");
        int sayi = scan.nextInt();

        for (int i = sayi; i <=100; i++) {
            if (i%3==0){
                System.out.print("Java0");
            }else if (i%5==0){
                System.out.println("Guzeldir");
            }else if(i%3==0 && i%5==0){
                System.out.print("Java Guzeldir");
            } else {
                System.out.print(i+" ");
            }
        }


    }
}
