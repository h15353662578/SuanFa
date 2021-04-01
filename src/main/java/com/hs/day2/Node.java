package com.hs.day2;

/**
 * @author Huasheng
 * @Date 2021/04/01/9:08
 * @Description
 */
public class Node {
    int data;
    Node next = null;

    public Node(int data){
        this.data=data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }
}

class NodeList {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.setNext(node2);
        node2.setNext(node3);
        Node nodeTwo1 = new Node(4);
        Node nodeTwo2 = new Node(7);
        Node nodeTwo3 = new Node(8);
        nodeTwo1.setNext(nodeTwo2);
        nodeTwo2.setNext(nodeTwo3);
        while (node1 !=null){
            System.out.println(node1.data);
            node1 = node1.next;
        }
        while (nodeTwo1 != null){
            System.out.println(nodeTwo1.data);
            nodeTwo1 = nodeTwo1.next;
        }

        /***
         * 调用betw方法
         */
//        Node node=Betw(node1,nodeTwo1);
//        while (node!=null){
//            System.out.println(node.data);
//            node=node.next;
//        }
//    }

        /***
         * Betw方法合并两个有序链表
         */
//    public static Node Betw(Node node1,Node nodeTwo1){
//        if (node1 == null){
//            return nodeTwo1;
//        }
//        if (nodeTwo1 == null){
//            return node1;
//        }
//        Node node;
//        if (node1.getData() < nodeTwo1.getData()){
//            node=node1;
//            node.setNext(Betw(node1.getNext(),nodeTwo1));
//        }else {
//            node=nodeTwo1;
//            node.setNext(Betw(nodeTwo1.getNext(),node1));
//        }
//        return node;

    }

}