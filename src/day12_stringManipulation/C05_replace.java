package day12_stringManipulation;

public class C05_replace {
    public static void main(String[] args) {

        String str="bugun ne cok sey ogrendik";

        //bu cumledeki bosluk disindaki karakter sayisini bulunuz
        System.out.println("space haric karakter sayisi: "+str.replace(" ","").length());

        //atama yapilmadigi surece orjinal String kalici olarak degismez
        //sadece o satir icin degisiklik yapilip sonuc yazdirilmis olur
        System.out.println(str.length());

        //str da kalici degisiklik yapalim
        //bugun yerine yarın
        //ogrendik yerine ogrenecegiz

        str=str.replace("bugun","yarın");
        str=str.replace("ogrendik","ogrenecegiz");

        System.out.println("kalici degisiklikten sonra : "+str);






    }
}
