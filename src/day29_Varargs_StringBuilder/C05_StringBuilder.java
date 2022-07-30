package day29_Varargs_StringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Ali Can");
        StringBuilder sb2=new StringBuilder("Ali Can");

        String str="Ali Can";

        System.out.println(sb1.compareTo(sb2));
        //Compare iki sb'yi esit mi diye kontrol etmek icin
        //ilk harften baslayarak tum karakterleri karsilastirir
        //ayni olan karakterler icin bir sey yazdirmaz
        //farkli lan ilk karakter icin ascii tablosuna gore kac deger
        // ileride veya geride oldugunu yazdirir


        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.equals(sb1));
    }
}
