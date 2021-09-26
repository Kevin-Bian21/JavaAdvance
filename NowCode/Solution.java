package NowCode;

import java.util.Stack;

/**
 * @author BianWenKai
 * @DATE 2021/9/25 - 20:12
 **/

 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
    public   void add(int i){
        ListNode newNode = new ListNode(i);
        if (next == null){
            next = newNode;
            return;
        }
        ListNode cur = next.next;
        while (cur != null){
            cur.next = newNode;
            cur = cur.next;
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode node = new ListNode(0);
        node.add(1);
        node.add(2);
        node.add(3);
        while (ReverseList(node) != null){
            System.out.println(ReverseList(node).val);
        }
    }



    public static ListNode ReverseList(ListNode head) {
        if(head == null)
            return null;
//        ListNode cur = head;
//        ListNode temp = head;
//        while(head.next != null){
//            cur = temp;
//            temp = cur.next;
//            head = cur.next.next;
//            temp.next = cur;
//        }
//        return head;
        Stack<Integer> stack = new Stack<>();
        ListNode cur = head;
        while(cur != null){
            stack.push(cur.val);
            cur = cur.next;
        }
        head.val = stack.pop();
        cur = head;
        while(!stack.empty()){
            cur.next.val = stack.pop();
            cur = cur.next;
        }
        return head;
    }
}