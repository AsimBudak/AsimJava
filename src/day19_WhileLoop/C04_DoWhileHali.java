package day19_WhileLoop;

public class C04_DoWhileHali {
    public static void main(String[] args) {
        int input = 3;
        int sayi = 1;

        sayi = 1;
        do {
            System.out.println(sayi);
            sayi++;
        } while (sayi < input);
    }
}
