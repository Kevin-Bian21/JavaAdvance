/**
 * @author BianWenKai
 * @DATE 2021/9/23 - 20:51
 **/
public class Error {
    public static void Error(){
        System.out.println("普通方法");
    }

    public static void main(String[] args) {
        try {
            ClassLoader c = Error.class.getClassLoader();
            ClassLoader c1 = c.getParent();
            ClassLoader c2 = c1.getParent();
            System.out.println(c);
            System.out.println(c1);
            System.out.println(c2);
            Error();
            throw new java.lang.Error("Error");
        }catch (java.lang.Error error){
            error.printStackTrace();
        }
    }
}
