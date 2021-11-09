package NowCode;

import java.util.ArrayList;

/**
 * @author BianWenKai
 * @DATE 2021/10/20 - 11:50
 **/
public class Practice {

    public static void main(String[] args) {
        Practice practice = new Practice();

    }

     public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
      }
        /**
         *
         * @param root TreeNode类 the root of binary tree
         * @return int整型二维数组
         */
        static ArrayList<Integer> array = new ArrayList<Integer>();
        public int[][] threeOrders (TreeNode root) {
            int[] pri=  priOrder(root);
            array.clear();
            int[] mid = midOrder(root);
            array.clear();
            int[] last = lastOrder(root);
            array.clear();
            int[][] array = {pri,mid,last};
            return array;
            // write code here
        }

        private int[] priOrder(TreeNode root){
            if (root == null)
                return null;
            array.add(root.val);
            priOrder(root.left);
            priOrder(root.right);
            int[] arr = new int[array.size()];
            for (int i=0;i< array.size();i++){
                arr[i] = array.get(i);
            }
            return arr;
        }
        private int[] midOrder(TreeNode root){
            if (root == null)
                return null;
            midOrder(root.left);
            array.add(root.val);
            midOrder(root.right);
            int[] arr = new int[array.size()];
            for (int i = 0;i< array.size();i++){
                arr[i] = array.get(i);
            }
            return arr;
        }
        private int[] lastOrder(TreeNode root){
            if (root == null)
                return null;
            lastOrder(root.left);
            lastOrder(root.right);
            array.add(root.val);
            int[] arr = new int[array.size()];
            for (int i = 0;i< array.size();i++){
                arr[i] = array.get(i);
            }
            return arr;
        }
    }
