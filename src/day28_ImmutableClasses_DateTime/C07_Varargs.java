package day28_ImmutableClasses_DateTime;

public class C07_Varargs {
    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;

        toplaGel(sayi1, sayi2);
        toplaGel(sayi1, sayi2, sayi3);
    }

    private static void toplaGel(int... sayi) {
        int toplam=0;
        for (int each:sayi
             ) {
            toplam+=each;
        }
        System.out.println(toplam);
    }
}