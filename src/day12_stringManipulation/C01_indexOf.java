package day12_stringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {

        //kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //  -girilen kelime cumlede kullanilmamis
        //  -girilen kelime cumlede 1 kere kllanilmis
        //  -girilen kelime cumlede 1'den fazla kullanilmis
        String cumle="java ogren,yeni prograam ile yeni bir sayfa ac";
        String kelime="yeni";

        int ilKullanim=cumle.indexOf(kelime); // -1 veya index
        int ikinciKullanim= cumle.indexOf(kelime,ilKullanim+1);

        if (ilKullanim==(-1)){
            System.out.println("girilen kelime cumlede kullanilmamis");
        }else if (ikinciKullanim==(-1)){
            System.out.println("girilen kelime cumlede 1 kere kullanilmis");
        }else{
            System.out.println("girilen kelime cumlede 1'den fazla kullanilmis");
        }


    }
}
