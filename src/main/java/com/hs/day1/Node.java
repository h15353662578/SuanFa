package com.hs.day1;

/**
 * @author Huasheng
 * @Date 2021/03/31/15:18
 * @Description
 */

//创建新链表 每一个链表由多个节点组成
public class Node {

    //定义数据
    private String data;

    //用于保存下一个节点
    private Node next;

    //每一个Node类都要有数据
    public Node(String data) {
        this.data =data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}

class LinkedList{
    public static void main(String[] args) {

        //添加数据
        Node root = new Node("1");
        Node n1 = new Node("2");
        Node n2 = new Node("3");


        //链接节点
        root.setNext(n1);
        n1.setNext(n2);

        //取出所有数据
        /***
         * 从根节点 root开始取
         */
        Node curr = root;
        while ( curr != null ){
            System.out.println(curr.getData());
            //将下一个节点设置为当前节点s
            curr = curr.getNext();
        }
    }
}
