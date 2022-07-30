package day29_AccessModifiers_Encapsulation;

public class C04_Encapsulation {
    public static void main(String[] args) {

        /* bir variable'yi encapsule etmek icin
           1- access modifier'i private yapariz
           2- okuma ve yazma ozelliklerinşn kullanilmasini istedigimiz gibi sinirlayabiliriz
                - eger sadece okunmasini istiyorsak getter
                - sadece girilebilnesinşi istiyorsaniz setter
               methodlari olustururuz


           bir veriable icin hem getter hem setter olusturursaniz
           o veriable public olmus gibi hem okuyup hem de yazilmasini saglayabilirizsiniz

         */


        C03 obj = new C03();

        System.out.println(obj.getSayi());//0

        obj.setStr("java java java");
        System.out.println(obj.getStr());

        System.out.println(obj);


    }
}
