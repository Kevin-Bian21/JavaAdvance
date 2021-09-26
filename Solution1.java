import javafx.application.Application;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author BianWenKai
 * @DATE 2021/9/14 - 20:50
 **/
public class Solution1 {
    String name;
    public static void main(String[] args) {
        System.out.println(reverseWords("I am a study hard student.",2));
        String s = "abc";
        String s1 = new String("abc");
        // intern() 方法返回字符串对象的规范化表示形式。
        // 它遵循以下规则：对于任意两个字符串 s 和 t，当且仅当 s.equals(t) 为 true 时，s.intern() == t.intern() 才为 true。
        System.out.println(s == s1);
        System.out.println(s == s1.intern());
        System.out.println("===========================");
        Integer a = 1;
        System.out.println(a == Integer.valueOf(1));
        Integer b =200;
        //在Integer类装载入内存时，把[-128, 127]范围内的整型数据装包成Integer类，并将其对应的引用放入到cache数组中,如果值不在该范围内，则在内存中重新开辟内存空间创建新对象。
        System.out.println(b == Integer.valueOf(200));

    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 给定一行英文句子和一个数字i，将第1个至第i个单词的顺序翻转，将第i+1个至最后一个单词的顺序翻转，单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。
     * @param s string字符串 输入字符串
     * @param i int整型 序号
     * @return string字符串
     */
    public static String reverseWords (String s, int i) {
        // write code here

        String[] arr = (String[]) Arrays.asList(s.split(" ")).toArray();
        if (i < arr.length){
            String temp = arr[0];
            arr[0] = arr[i-1];
            arr[i-1] =temp;
            temp = arr[i];
            arr[i] = arr[arr.length -1];
            arr[arr.length -1] =temp;
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < arr.length; j++) {
            sb.append(arr[j]);
            if (j == arr.length - 1)
                break;
            sb.append(" ");
        }
        return sb.toString();
    }
}
