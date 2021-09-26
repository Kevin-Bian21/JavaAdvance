package StaticCode;

/**
 * @author BianWenKai
 * @DATE 2021/9/14 - 22:45
 **/
public class Son extends Father {

    static {
        System.out.println("子类中的静态方法");
    }

    {
        System.out.println("子类中的匿名方法");
    }

    public Son(){
        System.out.println("子类中的构造方法");
    }

    @Override
    public void test() {
        super.test();
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.test();
        System.out.println("================");
        Father father = new Father();
        father.test();
    }
}
/*
    父类中的静态方法
    子类中的静态方法
    父类中的匿名方法
    父类中的构造方法
    子类中的匿名方法
    子类中的构造方法
    父类中的普通方法
    ================
    父类中的匿名方法
    父类中的构造方法
    父类中的普通方法
 */