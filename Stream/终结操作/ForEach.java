package Stream.终结操作;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author BianWenKai
 * @DATE 2021/12/9 - 21:14
 **/
public class ForEach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("car");
        list.add("can");
        list.add("care");

        list.forEach( s -> System.out.println(s));
    }
}
