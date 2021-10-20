package Test;

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

        System.out.println(""+a+b);
        System.out.println(a+b+"");
    }
}
