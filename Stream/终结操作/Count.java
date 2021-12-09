package Stream.终结操作;

import java.util.ArrayList;
import java.util.List;

/**
 * @author BianWenKai
 * @DATE 2021/12/9 - 21:20
 **/
public class Count {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("car");
        list.add("can");
        list.add("care");

        int c = (int)list.stream()
                .distinct()
                .count();
        System.out.println(c);
    }

}
