package testACM;

import java.util.Scanner;

//题目 https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
// 输入：head = [1,2,3,4,5], n = 2
// 输出：[1,2,3,5]
public class Main_WBW {
    //acm 的主函数
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str = in.nextLine();
            int k = in.nextInt();
            ListNode head = new ListNode(-1);
            ListNode p = head;
            String[] strArray = str.split(" ");
            for(int i = 0; i < strArray.length - 1; i++){
                p.next = new ListNode(Integer.parseInt(strArray[i]));
                p = p.next;
            }


//            head = reverseK(head.next, k);
//            printList(head);
        }
    }

    private static void printList(ListNode head) {
        while(head != null){
            System.out.print(head.val);
            if(head.next != null){
                System.out.print("->");
            }
            head = head.next;
        }
    }
}

/**
 * Definition for singly-linked list.*/

 class ListNode { //去掉public
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;
        while (n-- > 0) {
            fast = fast.next;
        }
        // 记住 待删除节点slow 的上一节点
        ListNode prev = null;
        while (fast != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        // 上一节点的next指针绕过 待删除节点slow 直接指向slow的下一节点
        prev.next = slow.next;
        // 释放 待删除节点slow 的next指针, 这句删掉也能AC
        slow.next = null;

        return dummy.next;
    }
}