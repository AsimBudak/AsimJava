package day12_stringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        //kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //  -girilen kelime cumlede kullanilmamis
        //  -girilen kelime cumlede 1 kere kllanilmis
        //  -girilen kelime cumlede 1'den fazla kullanilmis
        String cumle="java ogren,yeni prograam ile yeni bir sayfa ac";
        String kelime="yeni";

        int ilKullanim=cumle.indexOf(kelime); // -1 veya index
        int sonKullanim=cumle.lastIndexOf(kelime);

        if (ilKullanim==(-1)){
            System.out.println("girilen kelime cumlede kullanilmamis");
        }else if (ilKullanim==sonKullanim){
            System.out.println("girilen kelime cumlede 1 kere kllanilmis");
        }else {
            System.out.println("girilen kelime cumlede 1'den fazla kullanilmis");
        }



    }
}
