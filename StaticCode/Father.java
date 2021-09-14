package StaticCode;

/**
 * @author BianWenKai
 * @DATE 2021/9/14 - 22:45
 **/
public class Father {

    static {
        System.out.println("父类中的静态方法");
    }
    public Father(){
        System.out.println("父类中的构造方法");
    }

    {
        System.out.println("父类中的匿名方法");
    }
    public void test(){
        System.out.println("父类中的普通方法");
    }

    public static void main(String[] args) {
        Father father = new Father();
        father.test();
    }
}
/*
    父类中的静态方法
    父类中的匿名方法
    父类中的构造方法
    父类中的普通方法
 */