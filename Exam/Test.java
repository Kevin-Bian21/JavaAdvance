package Exam;

/**
 * @author BianWenKai
 * @DATE 2021/9/9 - 15:00
 **/
public class Test {

    public static void main(String[] args) {
        System.out.print(B.c);
    }
}

class A {
    static {
        System.out.print("A");
    }
}

class B extends A{
    static {
        System.out.print("B");
    }
    public final static String c = "C";
}