package day25_Constructor;

public class volvo_Runner {
    public static void main(String[] args) {

        volvo arb1 = new volvo();
        System.out.println(arb1.marka);//volvo
        arb1.yakit = "dizel";
        arb1.elektrikliMi = false;
        System.out.println(arb1.maxHiz);//240

        System.out.println(arb1.toString());//

        volvo arb2=new volvo();
        arb2.yakit= "elektrikli";
        arb2.elektrikliMi= true;
        arb2.model= "XC90";
        System.out.println(arb2.toString());



    }


}
