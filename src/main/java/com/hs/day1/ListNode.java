package com.hs.day1;

/**
 * @author Huasheng
 * @Auther: 华生
 * @Date: 2021/03/31/14:13
 * @Description: 单链表
 * 一种链式存取的数据结构
 * 单链表中的数据是以结点的形式存在
 * 每一个结点是由数据元素和下一个结点的存储的位置组成
 * 单链表与数组相比的最大差别是：单链表的数据元素存放在内存空间的地址是不连续的
 * 而数组的数据元素存放的地址在内存空间中是连续的
 * 这也是为什么根据索引无法像数组那样直接就能查询到数据元素
 */
//创建一个链表的类
class ListNode{

    //数值 data
    int value;

    // 结点 node
    ListNode next;

    //可以定义一个有参构造方法，也可以定义一个无参构造方法
    ListNode(int x){
        value = x;
    }

    // 添加新的结点
    public void add(int newValue) {
        ListNode newNode = new ListNode(newValue);
        if(this.next == null) {
            this.next = newNode;
        }else {
            this.next.add(newValue);
        }
    }

    // 打印链表
    public void print() {
        System.out.print(this.value);
        if(this.next != null)
        {
            System.out.print("-->");
            this.next.print();
        }
    }
}
class CreateListNode{

    public static void main(String[] args) {

        //创建链表对象l1
        ListNode l1= new ListNode(1);
        //插入节点并打印
        l1.add(2);
        l1.add(3);
        l1.print();

        //创建链表l2
        ListNode l2 = new ListNode(1);
        l2.add(4);
        l2.add(2);
        l2.add(5);
        l2.print();
    }
}

class Solution{

    public ListNode twoList(ListNode l1 ,ListNode l2){

        //创建新的链表
        ListNode betw = new ListNode(0);
        ListNode curr = betw;
        while(l1 !=null && l2 !=null){
            if (l1.value> l2.value){
                curr.next = l1;
                curr = curr.next;
                l1 = l1.next;
            }else{
                curr.next = l2;
                curr = curr.next;
                l2 = l2.next;
            }
        }

        //有一方为空时 将剩下的链到curr上
        if(l1 == null){
            curr.next = l2;
        }else{
            curr.next = l1;

            //从头节点开始返回 也就是合并后的链表

        }
        return betw.next;
    }
}





