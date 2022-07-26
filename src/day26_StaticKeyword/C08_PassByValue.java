package day26_StaticKeyword;

public class C08_PassByValue {
    public static void main(String[] args) {

        double etiketFiyati=100;
        yuzdeOnIndirimYap(etiketFiyati);
        yuzdeOnIndirimYap(etiketFiyati);
        System.out.println("iki ,ndirimden sonra main methodta etiket fiyati: "+etiketFiyati);
    }

    private static void yuzdeOnIndirimYap(double etiketFiyati) {

        etiketFiyati=etiketFiyati*0.90;
        System.out.println("sizin icin %10 indiimli fiyatiniz : "+etiketFiyati);
    }
}
