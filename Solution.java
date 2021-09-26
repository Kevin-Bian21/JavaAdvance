/**
 * @author BianWenKai
 * @DATE 2021/9/14 - 20:11
 **/
import java.util.*;


public class Solution {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] a = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(shuffle(a, 0)));
    }
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 将数组从指定位置拆分后交替重组。
     * @param arr int整型一维数组 输入数组
     * @param i int整型 切分偏移
     * @return int整型一维数组
     */
    public static int[] shuffle (int[] arr, int i) {
        // write code here

        int length = arr.length - i;
        if (i >= arr.length){
            length = 0;
            i = arr.length;
        }
        int[] arr1 = new int[i];
        int[] arr2 = new int[length];
        for (int j = 0; j < arr.length; j++) {
            if (j < i)
                arr1[j] = arr[j];
            else
                arr2[j-i] = arr[j];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            if (index < arr1.length){
                arr[j] = arr1[index];
            }
            if (index < arr1.length && index < arr2.length)
                j++;
            if (index < arr2.length)
                arr[j] = arr2[index];
            index ++;
        }
        return arr;
    }
}