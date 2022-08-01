package day30_part3;

import day30_part2.Parent;

public class Child extends Parent {

    //bir class i child class yaptigimizda
    //parent classtaki constructor a ulasmasi gerekir
    //bu durumda parent classtaki constructorin
    //access modifieri uygun bi modifier yapilmalidir


    //Child classta tum constructorlarin ilk satirina
    //java nin yerlestirdigi constructor PARAMETRESİZ yani super() dir

    Child(){
        super();
        System.out.println("child class parametresiz cons.");
    }
Child(int s){

    System.out.println("child class parametreli cons");
}
    public static void main(String[] args) {
        Child child=new Child(5);
    }

}
