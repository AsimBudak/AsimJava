package day07;

public class C01_Concate {
    public static void main(String[] args) {

        String str1="java";
        String str2="candir";

        //java candir yazdiralim

        System.out.println(str1+" "+str2);

        String cumle=str1.concat(str2); // javacandir

        cumle=str1.concat(" ").concat(str2);

        System.out.println(cumle);

        //concat icine sadece String yazilir baska deger kabul etmez icine string parametre ister



    }
}
