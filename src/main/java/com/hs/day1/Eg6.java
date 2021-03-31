package com.hs.day1;

/**
 * @author Huasheng
 * @Date 2021/03/31/21:57
 * 单链表排序
 * @Description
 */
public class Eg6 {
    //链表节点数据
    int data;

    //链表指向下一个节点的指针
    Eg6 next = null;

    public Eg6 getNext() {
        return next;
    }

    public Eg6(int data){
        this.data = data;
    }
}


class DescList{

    /***
     * 对链表从小到大进行排序
     */
    public Eg6 DescList(Eg6 head){
        //记录每次循环最小值
        int temp;

        Eg6 currEg6 = head;
        while(currEg6 != null){
            /***
            * 内循环从当前节点的下一个节点循环到尾节点
            * 找到外循环的值比较小的那个 与外循环交互
            */
            Eg6 nextEg6 = currEg6.next;
            while (nextEg6 != null){
                //比外循环小的放到前面
                if (nextEg6.data < currEg6.data){
                    temp = nextEg6.data;
                    nextEg6.data = currEg6.data;
                    currEg6.data = temp;
                }
                nextEg6 = nextEg6.next;
            }
            currEg6 = currEg6.next;
        }
        return head;
    }

    /***
     * 新增节点
     */
    public Eg6 addEg6(int data,Eg6 head){
        Eg6 eg6 = new Eg6(data);
        if (head == null){
            head = eg6;
            return head;
        }
        Eg6 currEg6 = head;
        //循环找到当前链表尾节点
        while (currEg6.next != null){
            currEg6 = currEg6.next;
        }
        //尾节点的指针指向增加新的节点
        currEg6.next = eg6;
        return head;
    }

    /***
     * 打印链表
     */
    public void println(Eg6 head){
        Eg6 currEg6 = head;
        //循环遍历到尾节点
        while (currEg6 != null){
            System.out.println(currEg6.data + "");
            currEg6 = currEg6.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DescList descList = new DescList();

        //链表头指针
        Eg6 head = null;

//        新增节点第一次新增时要返回头指针 用于定位链表
        head = descList.addEg6(2,head);
        descList.addEg6(7,head);
        descList.addEg6(1,head);
        descList.addEg6(60,head);
        descList.addEg6(2,head);
        descList.addEg6(6,head);
        descList.addEg6(2,head);
        descList.addEg6(3,head);
        System.out.println("排序链表前: ");
        descList.println(head);

        //排序链表
        head = descList.DescList(head);

        System.out.println("排序链表后: ");
        descList.println(head);
    }

}


