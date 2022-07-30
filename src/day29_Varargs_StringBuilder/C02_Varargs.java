package day29_Varargs_StringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {
        //parametre olarak bir int
        //ve istedigimiz kadar String alan
        //en uzun kelimenin harf sayisi ileint parametre degerini
        //carpip sonucu yazdiran bir method olusturun


        int sayi = 5;
        String str1 = "Zulal";
        String str2 = "Zeynep";
        String str3 = "abdurrahman";


        carpim(sayi, str1, str2,str3);
        //bir methodta varargs disinda parametre kullanacaksak
        //once diger parametreleri yazip, varargsi en sona yazmaliyiz
        //bu sebeple bir methodta birden fazla varargs olamaz

    }

    private static void carpim(int sayi, String... str) {

        String enUzunStr="";

        for (String each : str
        ) {
            if (each.length() > enUzunStr.length()) {
                enUzunStr = each;
            }
        }
        System.out.println("istenen deger : "+ sayi*enUzunStr.length());
    }
}
