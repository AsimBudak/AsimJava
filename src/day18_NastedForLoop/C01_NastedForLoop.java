package day18_NastedForLoop;

public class C01_NastedForLoop {
    public static void main(String[] args) {
        //kullanicidan bir rakam carpim tablosu olusturalim
        int input =3;

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=input ; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println("");
        }



    }
}
