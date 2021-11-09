package NowCode;

import java.util.*;

/**
 * @author BianWenKai
 * @DATE 2021/10/29 - 20:00
 **/
public class LRU {

    /*
     分析:
        1.使用linkedList链表来存储map对象：如果缓存满了继续往里set时，将链表的第一个元素删除(因为链表第一个元素是进来最久且没有被使用的)，然后将要存储的元素链到链表的末尾
        2.当需要get时，首先应判断map中是否存在要get的key值，如果没有，则返回数组 [key,-1];如果有该key对应的map结点，则将该map节点先删除，然后重新链接到链表的末尾。
     */

    List<Map<Integer,Integer>> list = new LinkedList<>();
    Map<Integer,Integer> map = new HashMap<>();
    public int[] LRU(int[][] operators, int k) {
        // write code here
        int[] array = new int[k];
        for (int i=0;i< operators.length;i++) {
            if (operators[i][0] == 1)
                set(operators,i,k);
            else if (operators[i][0] == 2)
                  get(operators,operators[i][1]);
        }
        for (int i = 0; i < list.size(); i++) {

        }
        return null;
    }

//    public static class LinkList{
//        private Node first;
//        private Node last;
//        private int size;
//
//        public LinkList() {
//            this.first = null;
//            this.last = null;
//            this.size = 0;
//        }
//
//        public static class Node {
//            public Node pre;
//            public Node next;
//            public Map date;
//
//            public Node(Map date) {
//                this.date = date;
//            }
//        }
//
//        private void add(Map map) {
//            Node node = new Node(map);
//            if (first == null) {
//                first = node;
//                last = node;
//                size ++;
//            }
//             Node cur = last;
//             last.next = node;
//             last = last.next;
//             last.pre = cur;
//             size++:
//        }
//        private void remove(int i) {
//
//            Node node = new Node(map);
//            if (first == null) {
//                first = node;
//                last = node;
//                size ++;
//            }
//            Node cur = first;
//            cur.next = node;
//            node.pre = cur;
//            cur= cur.next ;
//            last = node;
//        }
//
//    }


    private Map.Entry getEntry(int i){
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey().equals(i)){
                return entry;
            }
        }
        return null;
    }
    private void set(int[][] operators, int i, int k) {
        if (list.size() == k){
            list.remove(0);
        }
        map.put(operators[i][1],operators[i][2]);
        list.add(map);
    }

    private int[] get(int[][] operators, int i) {
        if (!map.containsKey(i)) {
            return new int[]{i, -1};
        } else {
            list.remove(getEntry(i));
            map.put(operators[i][1],operators[i][2]);
            list.add(map);
        }
        return null;
    }

}
