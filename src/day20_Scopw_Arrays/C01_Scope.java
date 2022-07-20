package day20_Scopw_Arrays;

public class C01_Scope {

    int sayi;
    String bransIsmi="java";
    boolean okulAcikmi;

    public static void main(String[] args) {

        //sayi variablesi static olmadigi icin man methodtan direkt kullanilamaz
        //instance variable'lara static method'larddan ulasabilmek icin obje olusturmamiz gerekir

        C01_Scope obj1=new C01_Scope();
        System.out.println(obj1.sayi);// 0
        obj1.sayi=10;
        System.out.println(obj1.sayi);
    }
}
