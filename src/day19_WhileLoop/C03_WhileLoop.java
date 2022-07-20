package day19_WhileLoop;

public class C03_WhileLoop {
    public static void main(String[] args) {
        //kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

        int imput=7629;
        int rakam=0;
        int rakamlarToplami=0;

        while (imput>0){
            rakam=imput%10;
            rakamlarToplami+=rakam;
            imput/=10;
        }
        System.out.println(rakamlarToplami);

    }
}
