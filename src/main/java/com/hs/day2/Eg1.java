package com.hs.day2;

import com.hs.day1.Eg7;

/**
 * @author Huasheng
 * @Date 2021/04/01/9:42
 * @Description
 */
public class Eg1 {
    int data;
    Eg1 next = null;

    public Eg1(int data){
        this.data=data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Eg1 getNext() {
        return next;
    }

    public void setNext(Eg1 next) {
        this.next = next;
    }
}
class Sort{

    public static Eg1 sortList1(Eg1 head){

        int temp;

        Eg1 curEg1 = head;

        while (curEg1 != null){

            Eg1 nextEg1 = curEg1.next;

            while (nextEg1 != null){

                if (nextEg1.data < curEg1.data){

                    temp = nextEg1.data;

                    nextEg1.data = curEg1.data;

                    curEg1.data = temp;

                }

                nextEg1 = nextEg1.next;

            }
            curEg1 = curEg1.next;

        }

        return head;

    }

    public static void main(String[] args) {
        Eg1 eg1 = new Eg1(1);
        Eg1 eg2 = new Eg1(3);
        Eg1 eg3 = new Eg1(2);
        eg1.setNext(eg2);
        eg2.setNext(eg3);
        Eg1 egTwo1 = new Eg1(6);
        Eg1 egTwo2 = new Eg1(8);
        Eg1 egTwo3 = new Eg1(2);
        egTwo1.setNext(egTwo2);
        egTwo2.setNext(egTwo3);
        Eg1 link1 = sortList1(eg1);
        Eg1 link2 = sortList1(egTwo1);
//        while (link1 != null){
//            System.out.println(link1.data);
//            link1 = link1.next;
//        }
//        while (link2 != null){
//            System.out.println(link2.data);
//            link2 = link2.next;
//        }

        Eg1 node = Betw(eg1,egTwo1);
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }

    }
    public static Eg1 Betw(Eg1 eg1,Eg1 egTwo1){
        if (eg1 == null){
            return egTwo1;
        }if (egTwo1 == null){
            return eg1;
        }
        Eg1 node;
        if (eg1.getData()< egTwo1.getData()){
            node=eg1;
            node.setNext(Betw(eg1.getNext(),egTwo1));
        }else{
            node=egTwo1;
            node.setNext(Betw(egTwo1.getNext(),eg1));
        }
        return node;
    }



}


