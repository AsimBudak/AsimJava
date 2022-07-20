package day21_Arrrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String arr1[]={"ali","veli","ayse"};
        //array icindeki elementlere ulasmak icin index kullaniriz

        System.out.println(arr1[0]); // ali

        arr1[1]="esila";

        System.out.println(arr1[1]); //esila

        //array icindeki indexi kullanarak elementlere ulasabilir ve update edebiliriz

        int arr2[]=new int[4];

        System.out.println(arr2[1]);//0
        System.out.println(arr2[3]);//0
        //System.out.println(arr2[5]);//hata veirr

        System.out.println(arr2);//[I@58ceff1
                                 // array'lar non-primitive olduklarindan direkt yazdirmak
                                 //istersek java referans bilgsini yazdirir

        for (int i = 0; i < 4; i++) {
            System.out.println(arr2[i]);
        }
//array'i yazdirmak icin javadaki arrays classindan toString() kullanilabilir

        System.out.println(Arrays.toString(arr2));

        arr2[1]=11;
        arr2[3]=22;
        System.out.println(Arrays.toString(arr2 ));


    }
}
