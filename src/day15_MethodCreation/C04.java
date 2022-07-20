package day15_MethodCreation;

public class C04 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //iki veriable'in degerlerini toplayan bir method olusturalim
        //1.adim: method adini yazdiralim
        //2.adim: methoda göndermem gereken argumant var mi?
        ikiSayiTopla(a, b);


    }

    //bir methodu olusturmak calismasi icin yeterli degildir
    //method ancak cagrilirsa calisir
    //ayni class veya farklı classta olmasinin bir onemi yoktur
    //java main method'da yukaridan asagiye dogru calisir
    //ve geldigi satiri calistirir

    private static void ikiSayiTopla(int a, int b) {
        System.out.println("verilen iki sayinin toplami: " + (a + b));
    }
}
