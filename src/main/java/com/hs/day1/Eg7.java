package com.hs.day1;

import com.hs.day2.Eg1;

/**
 * @author Huasheng
 * @Date 2021/03/31/22:56
 * @Description
 */
public class Eg7 {
    int data;
    Eg7 next = null;

    public Eg7 getNext() {
        return next;
    }

    public void setNext(Eg7 next) {
        this.next = next;
    }

    public Eg7(int data){
        this.data=data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

/***
 * 排序链表SortList
 */
class SortList{
    //节点Eg7 排序 给予Eg7一个头部标签head
    public Eg7 SortList(Eg7 head){
        //定义每次循环最小值
        int temp;
        //currEg7 标识Eg7的头部
        Eg7 currEg7 = head;
        //如果节点Eg7有头部 则进入循环排序
        while (currEg7 != null){
            //nextEg7表示寻找头部的下一位
            Eg7 nextEg7 = currEg7.next;
            //如果nextEg7还有下一位的话继续排序
            while (nextEg7 !=null){
                //如果nextEg7的数值小于第一位的数值 则把nextEg7的数值传入最小值标识temp
                if (nextEg7.data < currEg7.data){
                    //将nextEg7的值赋予temp
                    temp = nextEg7.data;
                    //则nextEg7放入第一位放入currEg7
                    nextEg7.data = currEg7.data;
                    //将currEg7值标记为最小值
                    currEg7.data = temp;
                }
                //如果循环还没结束 则把nextEg7下一位的值放入nextEg7
                nextEg7 = nextEg7.next;
            }
            //如果循环还没结束 则把currEg7下一位的值放入nextEg7
            currEg7 = currEg7.next;
        }
        //返回head标识
        return head;
    }

    /***
     * 新增节点数据
     */
    //定义新增方法 插入int类型data 给Eg7标识符head
    public Eg7 add(int data,Eg7 head){
        //实例化Eg7 赋予数据
        Eg7 eg7 = new Eg7(data);
        //如果头部为空 则第一个数据为头部
        if (head == null){
            head = eg7;
            return head;
        }
        //给currEg7赋值为头部
        Eg7 currEg7 = head;
        //如果currEg7还有下一位
        while (currEg7.next != null){
            //将下一位赋值给currEg7 继续循环
            currEg7 = currEg7.next;
        }
        //新传进的节点链接到链表尾部
        currEg7.next = eg7;
        //返回头部标识
        return head;
    }

    /***
     * 打印输出链表
     * @param head
     */
    public void println(Eg7 head){
        Eg7 currEg7 = head;
        while (currEg7 != null){
            System.out.println(currEg7.data+"");
            currEg7 = currEg7.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortList sortList = new SortList();

        Eg7 head = null;

        //新增节点
//        head = sortList.add(2,head);
//        sortList.add(6,head);
//        sortList.add(7,head);
//        sortList.add(53,head);
//        sortList.add(234,head);
//        sortList.add(432,head);
//        sortList.add(43,head);
//        sortList.add(64,head);
//        sortList.add(61,head);
//        sortList.add(45,head);
//        sortList.add(56,head);
//        sortList.add(67,head);
//        sortList.add(76,head);
//        sortList.add(87,head);
//        sortList.add(98,head);
//        sortList.add(12,head);
//        sortList.add(2,head);
//        sortList.add(1,head);
//        System.out.println("排序链表前: ");
//        sortList.println(head);
//
//
//        //排序 实例化调用SortList()方法
//        head = sortList.SortList(head);

        System.out.println("排序后 ");
        sortList.println(head);


        Eg7 eg1 = new Eg7(1);
        Eg7 eg2 = new Eg7(3);
        Eg7 eg3 = new Eg7(2);
        eg1.setNext(eg2);
        eg2.setNext(eg3);
        Eg7 link1 = sortList.SortList(eg1);
        while (link1 != null) {
            System.out.println(link1.data);
            link1 = link1.next;
        }
    }
}