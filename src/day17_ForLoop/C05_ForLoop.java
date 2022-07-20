package day17_ForLoop;

public class C05_ForLoop {
    public static void main(String[] args) {
        //baslangic ve biris sayilari arasinda artis iktarina göre olusacak butun sayilari yazdirin

        double baslangic=10;
        double bitis=20;
        double artisMiktari=0.2;

        for (double i = baslangic; i <=bitis ; i+=artisMiktari) {
            System.out.println(i+" ");
        }
    }
}
