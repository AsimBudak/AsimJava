package day15_MethodCreation;

public class C05_MethodCreation {
    public static void main(String[] args) {


        //stringi yazdiran method olusturalim
        //hosgeldiniz diyen bir method olusturalim
        //kapanma mesaji yazan bir method olustur

        hosgeldinYazdir();

    }

    public static void kapanmaMethodu() {
        System.out.println("bizi tercih ettiginiz icin tesekkurederiz");
    }

    public static void hosgeldinYazdir() {
        System.out.println("hosgeldin");
        stringiYazdır("boylede olur");
    }

    public static void stringiYazdır(String str) {
        System.out.println(str);
        kapanmaMethodu();
    }


}
