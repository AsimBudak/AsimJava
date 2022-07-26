package day26_StaticKeyword;

public class C01_Static {

    String okulismi="yildiz koleji";
    static String okulTelefonu="3122563635";

    public static void staticMethod(){
        System.out.println("static method calisti");
    }

    public void staticOlmayanMethod(){
        System.out.println("static olmayan method calisti");
    }
}
