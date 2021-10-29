package NowCode;

/**
 * @author BianWenKai
 * @DATE 2021/10/27 - 22:48
 **/
public class FindNumber {
    public static void main(String[] args) {
        int[] array = {1,3,4,7,9};
        FindNumber findNumber = new FindNumber();
        System.out.println(findNumber.findKth(array, array.length, 2));
    }
        public int findKth(int[] a, int n, int K) {
            // write code here
            int i = 0;
            quicklySort(a,0,n-1);
            for (i = n-1;i > 0;i--) {
                if (i == (a.length-K)){
                    return a[i];
                }
            }
            return a[i];
        }

        private void quicklySort(int[] array, int left, int right) {
            if (left > right) {
                return ;
            }
            int i = left;
            int j = right;
            int temp = array[i];
            while (i != j) {
                while (temp <= array[j] && i < j) {
                    j--;
                }
                while (temp >= array[i] && i < j) {
                    i++;
                }
                if (i < j) {
                    int num = array[i];
                    array[i] = array[j];
                    array[j] = num;
                }
            }
            array[left] = array[j];
            array[j] = temp;

            quicklySort(array, left, j-1);
            quicklySort(array, j+1 , right);
        }
    }
