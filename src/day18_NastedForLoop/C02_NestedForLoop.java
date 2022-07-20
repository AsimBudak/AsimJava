package day18_NastedForLoop;

public class C02_NestedForLoop {
    public static void main(String[] args) {
        //kullanicidan pozitif bir rakam girmesini isteyin ve girilen akama gore ucgen seklinde yazdirin

        int input = 5;


        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                //nested for loop dikdortgen veya ucgen formatında olabilir
                //dikdortgen istedigimizde iki loop icin de bagimsiz en point belirleriz
                //ucgen sekli vermek icin inner loop'un end point'ini alarak outher degiskene bağlarız

                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
