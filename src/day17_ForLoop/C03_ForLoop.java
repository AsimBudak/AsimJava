package day17_ForLoop;

import java.util.Scanner;

public class C03_ForLoop {
    public static void main(String[] args) {
        //kullanicidan 100'den kucuk bir tamsayi isteyin
        //1'den baslayarak girilen sayiya kadar 3'un kati olan sayilari yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 100'denkucuk bir tamsayi giriniz");
        int sayi = scan.nextInt();

        for (int i = sayi; i <=100; i++) {
            if (i%3==0){
                System.out.print(i+" ");
            }
        }


    }
}
