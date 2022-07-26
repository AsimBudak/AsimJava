package day26_StaticKeyword;

public class C09_PassByValue {
    //eger bir method'da yapilan degisikligin kalici olmasini istiyorsak
    //iki yontem kullanabiliriz
    //1-verianle'i class level'da static olarak olusturabilirim

static double etiketFiyati;
static double indirimYuzdesi;

    public static void main(String[] args) {

        etiketFiyati=100;
        indirimYuzdesi=10;
        kaliciIndirimYap();
    }

    private static void kaliciIndirimYap() {
        etiketFiyati=etiketFiyati*(100-indirimYuzdesi)/100;
        System.out.println("indirimli fiyat : "+etiketFiyati);
    }
}
