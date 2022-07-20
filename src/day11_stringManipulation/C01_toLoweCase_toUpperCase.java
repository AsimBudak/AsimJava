package day11_stringManipulation;

public class C01_toLoweCase_toUpperCase {
    public static void main(String[] args) {

        String str= "Java guzeldir";

        //biz string method'larini arka arkaya kullanabiliriz
        //mesela ikinci kelimenin ilk harfini kucuk olarak yazdiralim

        //str.charAt(5); //boyle yaptigimizda aonuc artik string dgil har olacaktir
        //dolayisiyle stringde yapmak istedgimiz tum degisikikleri
        //once yapip sonra charAt()methodunu kllanmalıyız
        System.out.println(str.toLowerCase().charAt(5));



    }
}
