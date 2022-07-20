package day13;

public class C07_soru5 {
    // Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.
    public static void main(String[] args) {

        String input="mavi";

        String tersStr= input.substring(3).toUpperCase()+
                input.substring(2,3).toLowerCase()+
                input.substring(1,2).toLowerCase()+
                input.substring(0,1).toLowerCase();

        System.out.println(tersStr);





    }
}
