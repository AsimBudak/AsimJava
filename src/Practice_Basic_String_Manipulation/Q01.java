package Practice_Basic_String_Manipulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz
        //yukarıdki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini alip birlestiriniz

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen iki tane kelime yaziniz");
        String str1=scan.nextLine();
        String str2=scan.nextLine();

        System.out.println("Stringlerin birlesmis hali : "+str1.concat(" "+str2));

        str1=str1.substring(1);
        str2=str2.substring(1);

        System.out.println(str1+" "+str2);



    }
}
