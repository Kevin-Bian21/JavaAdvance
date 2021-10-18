import java.util.Arrays;

/**
 * @author BianWenKai
 * @DATE 2021/9/28 - 9:31
 **/
public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{1,9,7,6,3,2,1,5};
        System.out.println(Arrays.toString(quickSort(array, 0, array.length - 1)));
        System.out.println(foo(6));
    }

    public static int[] quickSort(int[] array,int left,int right){
        if (left > right)
            return null;
        int i = left;
        int j = right;
        int temp = array[left];
        while (i != j){
            //从右往左找到小于基数的数
            while (array[j] >= temp && i < j)
                j--;
            //从左往右找到大于基数的数
            while (array[i] <= temp && i < j)
                i++;
            //两个哨兵没有相遇
            if (i < j){
                int t = array[i];
                array[i] = array[j];
                array[j] = t;
            }
        }
        //基数归位
        array[left] = array[i];
        array[i] = temp;

        quickSort(array,left,i-1);
        quickSort(array,i+1,right);
        return array;
    }
    public static int foo(int i){
        if (i <= 2)
            return i;
        return foo(i-1)+foo(i-2);
    }

}
