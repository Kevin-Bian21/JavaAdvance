package Exception;

/**
 * @author BianWenKai
 * @DATE 2021/9/12 - 10:37
 **/
public class DadException {

    public DadException(String msg){
        System.out.println(msg);
        System.out.println("DadException");
    }

    public void run(){
        System.out.println("父类的方法");
    }
}
