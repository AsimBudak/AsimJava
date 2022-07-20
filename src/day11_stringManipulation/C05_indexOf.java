package day11_stringManipulation;

public class C05_indexOf {
    public static void main(String[] args) {

        String str1 = "Java bir baska guzel";
//istersek char olarak verdigimiz bir harfin indexini bize dondurur
        System.out.println(str1.indexOf("J"));

        //istersek bir harf ya da metinolarak verdigimiz String'in indexini dondurur

        System.out.println(str1.indexOf("l"));
        System.out.println(str1.indexOf("aska"));//10
        System.out.println(str1.length() - 1);

        //ayni harften birden fazla varsa?
        System.out.println(str1.indexOf("b"));// buldugu ilk dogru eslesmenin indexini dondurur


        System.out.println(str1.indexOf("b",5));
        //bu method da java aramaya fromIndex olarak yazdigimiz indexten baslar(inclusive)

        //verilen String'deki 2.a harfinin indexini bulalim
        int ilkindex= str1.indexOf("a");//1
        System.out.println(str1.indexOf("a",ilkindex+1));//3

        //lastIndexOf String'de istenen karakterin kullanildigi son index'i dondurur






    }
}
