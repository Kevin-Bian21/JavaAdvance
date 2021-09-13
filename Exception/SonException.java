package Exception;

/**
 * @author BianWenKai
 * @DATE 2021/9/12 - 10:37
 **/
public class SonException extends DadException {

    public SonException(){
        super("SonException");
    }

    public final void run(){
        System.out.println("子类的方法被执行");
        super.run();
    }


    public static void main(String[] args) {
        SonException sonException = new SonException();
        sonException.run();

    }

}
