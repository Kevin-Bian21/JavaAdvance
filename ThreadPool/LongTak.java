package ThreadPool;

import java.rmi.server.ExportException;

/**
 * @author BianWenKai
 * @DATE 2021/9/13 - 15:41
 **/
public class LongTak {
    public static void simulate(){
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
