package day24_Constructor;

public class C01_forEachLoop {
    public static void main(String[] args) {

        int arr[] = {2, 4, 6, 8, 11};
        //elementleeri for loop ile yazdiralim

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("");

        //bunu for-each loop ile yapacak olursak
        //for-each loop u calistirmak icin hedef bir collection vermeliyiz

        for (int each : arr
        ) {
            System.out.println(each + " ");
        }

        //avantaji: index, baslangic degerti, bitis degeri gibi detaylarla
        //ugrasmammiza gerek kalmadan colections'dan tum elementleri bize getirir
        //dezaavantaji : index e bagli bir islem yapamayiz



    }
}
