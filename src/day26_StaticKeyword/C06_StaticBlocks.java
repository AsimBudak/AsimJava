package day26_StaticKeyword;

public class C06_StaticBlocks {
    //Static block class ilk calismaya basladiginda devreye girer
    //ve class'in calismasi icin gerekli on hazirliklar icin kullanilir
    //yazildigi satirin hic bir onemi yoktur, class icerisinde istenen yerde yazilabilir

    static {
        System.out.println("static block1 calisti");
    }

    static {
        System.out.println("static block2 calisti");
    }

    C06_StaticBlocks() {
        System.out.println("constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
        C06_StaticBlocks obj1;
        new C06_StaticBlocks();
        System.out.println("main method sonu");
    }

}








