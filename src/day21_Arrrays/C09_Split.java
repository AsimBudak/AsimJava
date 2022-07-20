package day21_Arrrays;

import java.util.Arrays;

public class C09_Split {
    public static void main(String[] args) {

        String str="java gun gectikce guzellesiyor";

       String kelimeler[]= str.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        System.out.println(kelimeler[1]);

        String gectikce[]=str.split("gectikce");
        System.out.println(Arrays.toString(gectikce));

    }
}
