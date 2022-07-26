package day26_StaticKeyword;

public class C02_StaticKeyword {
    public static void main(String[] args) {



    //baska class'taki static class uyelerine
    //ulasabilmek icin sadece classIsmi.staticUyeIsmi
    //yazmamiz yeterlidir

        System.out.println(C01_Static.okulTelefonu);

        C01_Static.okulTelefonu="3121313213";

        System.out.println(C01_Static.okulTelefonu);

        //baska classtaki static olmayan class uyelerine
        //ancak o class'dan obje olusturarak ulasabiliriz
        //ve obje ile yapilan atamalar sadece o obje icin gecerli olur
        C01_Static obj1=new C01_Static();
        C01_Static obj2=new C01_Static();

        System.out.println(obj2.okulismi);
        obj2.okulismi="sabir koleji";
        System.out.println(obj1.okulismi);
    }


}
