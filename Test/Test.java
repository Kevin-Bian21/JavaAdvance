package Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author BianWenKai
 * @DATE 2021/10/18 - 21:49
 **/
public class Test {
    public static void main(String[] args) {
        Integer a = new Integer(1);
        Integer b = new Integer(1);
        System.out.println(a==b); //false

        Integer c = 1;
        Integer d = 1;
        System.out.println(c == d); //true

        Integer e = 128;
        Integer f = 128;
        System.out.println(e==f);  //false

        Integer g = -128;
        Integer h = -128;
        System.out.println(g==h);  //true

        System.out.println(""+a+b);
        System.out.println(a+b+"");
        Object o = new Object();
        Test test = new Test();

    }
}
