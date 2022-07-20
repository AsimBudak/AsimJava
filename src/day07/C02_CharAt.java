package day07;

public class C02_CharAt {
    public static void main(String[] args) {

        //Stringde harhangi bir karakteri almak istedigimizde o harfin indexini kullanarak
        //str.charAt(istenenIndex) yazabiliriz

        String str="Java Cok Guzel";
        //J yi yazdiralim
        System.out.println(str.charAt(0));

        //G yi yazdiralim
        System.out.println(str.charAt(9));

        //cOK seklinde yazdiralim

        System.out.println(str.toLowerCase().charAt(5)+""+str.toUpperCase().charAt(6)+str.toUpperCase().charAt(7));;



    }
}
