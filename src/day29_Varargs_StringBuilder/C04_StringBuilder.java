package day29_Varargs_StringBuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Yasasin java");

        System.out.println(sb1.indexOf("java"));

        System.out.println(sb1.lastIndexOf("s"));
        System.out.println(sb1.indexOf("s"));

        System.out.println(sb1.replace(0,7,"ne guzel"));

        System.out.println(sb1);

        System.out.println(sb1.toString().toUpperCase());

        System.out.println(sb1);

        System.out.println(sb1.delete(0,3));

        System.out.println(sb1.deleteCharAt(5));



    }
}
