package Exam;

/**
 * @author BianWenKai
 * @DATE 2021/10/9 - 20:02
 **/
import java.util.*;


public class Solution {
    public static void main(String[] args) {
        String string = "BCC111CBB33330123";
        System.out.println(get_substr(string));
        int x = 1;
        int y = ++x;
        System.out.println(x);
        System.out.println(y);
    }
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param st string字符串
     * @return string字符串
     */

    public static String get_substr (String st) {
        int i = 0;
        int j = 0;
        while (j < st.length()){
            if (st.charAt(i) == st.charAt(j)){
                j++;
            }else {
                if (j - i >= 3){
                    st = st.substring(0,i)+st.substring(j,st.length());
                    j = 0;
                }
                i=j;
            }
        }
        if (j - i >= 3)
            st = st.substring(0,i)+st.substring(j,st.length());
        return st;
        // write code here
    }
}
