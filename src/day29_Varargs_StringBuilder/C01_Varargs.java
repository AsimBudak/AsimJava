package day29_Varargs_StringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {
        //kac tane String verilirse verilsin
        //iclerinden en uzun olani yazdran bir method olusturun
        String str1 = "Ali";
        String str2 = "veli";
        String str3 = "oguzhan";
        String str4 = "abdurahman";

        //yazilan argument sayisi sabitse her zamanki gibi bir method lusturabiliriz
        //ancak argument sayisinin degisme ihtimali varsa
        //o zaman varargs tercih edilir

        enUzunKelime(str1, str2, str3,str4);

    }

   private static void enUzunKelime(String... str) {
        String enUzunStr = "";

        for (String each : str
        ) {
            if (each.length() > enUzunStr.length()) {
                enUzunStr = each;
            }
        }
        System.out.println("En uzun kelime : " + enUzunStr);
    }
}
