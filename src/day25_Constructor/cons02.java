package day25_Constructor;

public class cons02 {
    public static void main(String[] args) {

        cons01 obj1 = new cons01(); //default constructor devrede
        /* cons01 class'inda hic constructor olusturmazsak,
        java default  constructor i kullandigindan
        oj1'i uretebiliriz

        ancak biz parametreli veya parametresiz bir constructor yaziginmizda
        java default constructor'i siler
        dolayisiyla biz herhangi bir constructor olusturdugumuzda
        daha once baska classlar veya kullanicilarin
        olusturmus olabilecegi objeleri kullanabilmeleri icin

         */
        cons01 obj2=new cons01("java");


    }
}
