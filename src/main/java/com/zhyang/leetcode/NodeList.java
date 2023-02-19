package com.zhyang.leetcode;

public class NodeList {

    public static void main(String[] args) {
        ReverseList.Node n5 = new ReverseList.Node(5, null);
        ReverseList.Node n4 = new ReverseList.Node(4, n5);
        ReverseList.Node n3 = new ReverseList.Node(3, n4);
        ReverseList.Node n2 = new ReverseList.Node(2, n3);
        ReverseList.Node n1 = new ReverseList.Node(1, n2);

        ReverseList.Node prev = ReverseList.Node.iterate(n1);
        System.out.println(prev);

    }

}

// 链表反转
 class ReverseList{
    static class Node{
        int val;
        Node next;

        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }

        public static   Node iterate(Node head){
            Node prev = null,next;
            Node curr = head;
            while (curr != null){
                // 中间变量存储当前值指向的下一个node
                next = curr.next;
                curr.next = prev; //当前节点 的next指向前一个 node

                prev = curr;  //当前node改变为 前一个节点
                curr = next; //后面一个节点做下一次的循环


            }

            return prev;
        }

    }
}


