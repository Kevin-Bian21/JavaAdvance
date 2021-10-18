package Exam;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author BianWenKai
 * @DATE 2021/10/13 - 18:28
 **/
public class WhereGo {
    public static void main(String[] args) {
        String string = "baAbb";
        System.out.println(solution(string));
    }

    public static StringBuilder solution(String str){
        Map<Character, Integer> map = new HashMap<>();
        Character c = null;
        for (int i = 0 ;i<str.length();i++){
            c = str.charAt(i);
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        int[] array = new int[map.size()];
        int index = 0;
        for (Map.Entry entry : map.entrySet()){
            array[index] = (Integer)entry.getValue();
            index ++;
        }
        boolean flag = true;
        for (int i=0;i<array.length-1;i++){
            for (int j=0;j<array.length-i-1;j++){
                if(array[j]< array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = false;
                }
            }
            if(flag)
                break;
        }
        System.out.println(Arrays.toString(array));
        StringBuilder sb = new StringBuilder("");
        for (int i = 0;i<array.length;i++){
            for (int j = 0 ;j<str.length();j++){
                if (array[i]==map.get(str.charAt(j))){
                    while (array[i] != 0){
                        sb.append(str.charAt(j));
                        array[i]--;
                    }
                }
            }
        }
        return sb;
    }
}
