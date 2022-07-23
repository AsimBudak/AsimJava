package day25_Constructor;

import org.w3c.dom.ls.LSOutput;

public class toyotaRunner {
    public static void main(String[] args) {
        toyota t1 = new toyota();
        System.out.println(t1.marka); // toyota
        System.out.println(t1.tekerAdeti);//4
        System.out.println(t1.model);//null
        t1.model = "corolla";
        t1.yakıt = "benzin";
        t1.yil = 2022;
        System.out.println("t1 modeli "+t1.model+", yakit "+t1.yakıt+", yıl"+t1.yil);

        toyota t2=new toyota();
        System.out.println(t2.model);//null
        t2.model = "yaris";
        t2.yakıt = "benzin";
        t2.yil = 2022;
        System.out.println("t2 modeli "+t2.model+", yakit "+t2.yakıt+", yıl"+t2.yil);

    }


}
