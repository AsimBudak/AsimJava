package day23_Practice;

import java.util.Arrays;

public class C01_soru1 {
    public static void main(String[] args) {
        //verilen bir int dizisi icin elemanlarin karelerini bulun
        // Ex: {2,6,4,5,8,9}

        int arr[] = {2, 6, 4, 5, 8, 9};

        for (int i = 0; i < arr.length; i++) {
            arr[i] *= arr[i];
        }
        System.out.println("elemanlarin karaleri "+ Arrays.toString(arr));

    }
}
