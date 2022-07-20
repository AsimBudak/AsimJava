package day13;

public class C01_substring {
    public static void main(String[] args) {

        String str="Java ile IT cok guzel";

        System.out.println(str.substring(5));// ile IT cok guzel
        //yukaridaki String'i Mehmet hoca ile IT cok guzel
        System.out.println(str.replace("Java","Mehmet hoca"));
        System.out.println("Mehmet hoca"+str.substring(5));

        System.out.println(str.substring(8));

        //eger bir index'ten sona kadar olan parcayi degil
        //belirli bir parcayi almak istersek
        //2 parametre yazmak gerekir str.substring(baslangicIndexi,bitisIndexi)
        //baslangic indexi ==>inclusive/dahil
        //bitis indexi ==>eclusive/haric

        System.out.println(str.substring(0,5));//java

    }
}
