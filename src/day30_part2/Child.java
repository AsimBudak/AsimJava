package day30_part2;

public class Child extends Parent {

    Child(){
        super();
        System.out.println("Child cons. calisti");
    }
    //tum classlarda biz gormesek bile
    //javanın olusturdugu bir default constructor vardir

    //Extends keyword kullanan class'lardaki
    //tum CONSTRUCTOR'larin ilk satirinda
    //biz gormesek bile super()
    //costructor call vardir

    public static void main(String[] args) {

        Child child=new Child();
    }
}
