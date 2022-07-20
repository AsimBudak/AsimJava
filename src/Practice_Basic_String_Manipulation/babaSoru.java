package Practice_Basic_String_Manipulation;

public class babaSoru {
    public static void main(String[] args) {

        //once topla sonra carp sonra cikar sonra yolla

        int sayi1=10;
        int sayi2=12;
        

            toplama(sayi1,sayi2);

    }

    private static void görüsürüz() {
        System.out.println("baybay");
    }

    private static void farklari(int sayi1, int sayi2) {
        System.out.println("sayilarin farki : "+(sayi1- sayi2));
        görüsürüz();
    }

    private static void toplama(int sayi1, int sayi2) {
        System.out.println("sayilarin toplami : "+(sayi1+sayi2));
        carpma(sayi1,sayi2);
    }

    private static void carpma(int sayi1, int sayi2) {
        System.out.println("sayilarin carpimi : "+(sayi1*sayi2));
        farklari(sayi1,sayi2);
    }
}
