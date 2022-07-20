package day17_ForLoop;

public class C02_forLoop {
    public static void main(String[] args) {
        //10 ile 30 arasindaki (10ile 30 dahil)
        //sayilari arasinda virgul olarak ayni satira yazdirin

        for (int i = 10; i <=30 ; i++) {
            System.out.print(i+",");

            int baslangic=10;
            int bitis=30;
            for (int j = baslangic; j <=bitis ; j++) {
                if(i<bitis){
                    System.out.print(i+",");
                }else{
                    System.out.print(i);
                }

            }

        }
    }
}
