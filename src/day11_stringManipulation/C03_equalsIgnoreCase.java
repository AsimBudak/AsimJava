package day11_stringManipulation;

import java.util.Scanner;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {

        //kullaniciya derse katilip katilmamak istedigini sorun
        //evet derse, cevabini ve "derse katiliminiz alinmistir" yazdirin
        //hayir derse cevabini ve "sonraki derslerimize bekleerinz" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("derse katilmak ister msiniz\nEvet veya Hayir yaziniz");
        String cevap=scan.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabiniz : "+cevap+"derse katilimiz onaylanmistir");
        }else if(cevap.equalsIgnoreCase("hayır")){
            System.out.println("sonraki derslerimize bekleriz");
        }else {
            System.out.println("lutfen gecerli bir cevap giriniz");
        }


    }
}
