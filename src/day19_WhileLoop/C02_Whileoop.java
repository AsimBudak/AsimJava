package day19_WhileLoop;

public class C02_Whileoop {
    public static void main(String[] args) {
        //kullanicidan bir sayi alin ve
        //bu sayiyi tam bolen sayilari ve toplam kac tane olduklariini ekranda yazdirin

        int input=20;

        int bolen=1;
        int sayac=0;

        while (bolen<=input){
            if (input%bolen==0){
                System.out.print(bolen+" ");
                sayac++;

            }
            bolen++;
        }
        System.out.println("");
        System.out.println(input+" sayinin bolen "+sayac+" adet sayi vardir");
    }
}
