package day23_Practice;

import java.util.Arrays;

public class C03_soru3 {
    public static void main(String[] args) {

        String str = "HeySiri";

        str = str.replace("Hey", "by");

        String[] arr = new String[1];
        arr[0] = str;
        System.out.println(Arrays.toString(arr));


    }
}
