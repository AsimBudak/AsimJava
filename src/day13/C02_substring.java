package day13;

public class C02_substring  {
    public static void main(String[] args) {

        //1-48 of 104 result for "nutella"
        //bu arama sonucundaki bulunan sonuc sayısı 100 dan cok ise super
        //az ise "sonuc bulundu"

        String str = "1-48 of 104 result for \"nutella\"";

        int ilkSpace= str.indexOf(" ");//4
        int ikinciSpace= str.indexOf(" ",ilkSpace+1);
        int ucuncuSpace= str.indexOf(" ",ikinciSpace);

        String aramaSonucSayisiStr=str.substring(ikinciSpace+1,ucuncuSpace);
        int aramaSonucSayisiInt=Integer.valueOf(aramaSonucSayisiStr);






    }
}
