package day29_AccessModifiers_Encapsulation;

public class C02_AccessModifier {
    public static void main(String[] args) {
        C01 obj = new C01();
        obj.acikString = "bye";
        C01.acikSayi = 50;

        //C01.sayi=15; privet access modifier oldugundan erisilemez



        C01 objParametreli=new C01(5);

    }


}
