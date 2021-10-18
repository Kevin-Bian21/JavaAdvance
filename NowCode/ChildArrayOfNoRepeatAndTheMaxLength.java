package NowCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author BianWenKai
 * @DATE 2021/10/10 - 23:03
 **/
//最长无重复子串
public class ChildArrayOfNoRepeatAndTheMaxLength {
    public static void main(String[] args) {
        int[] arr = {3,1,3,2,1,2,3,2,2,2,4};
        System.out.println(maxLength(arr));
    }
    /**
     *
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public static int maxLength (int[] arr) {
        // write code here
        if (arr.length < 1)
            return 0;
        int max = 1;
        int temp = 0;
        int count = 0;
        int flag = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i < arr.length;i++) {
            if (map.containsValue(arr[i])){
                for (int j = 0; j < map.size(); j++) {
                    if (arr[j] == arr[i])
                        count ++;
                }
                for (int j = 0; j < map.size(); j++) {
                    if (arr[j] == arr[i]){
                        count --;
                        if (count == 0 ){
                            temp = j+1;
                            if (flag > temp){
                                temp = flag;
                                break;
                            }
                            flag = temp;
                        }
                    }
                }
            }
            map.put(i,arr[i]);
            if (max < i-temp+1)
                max = i-temp+1;
        }
        return max;
    }
}
