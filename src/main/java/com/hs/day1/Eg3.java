package com.hs.day1;

/**
 * @author Huasheng
 * @Date 2021/03/31/16:26
 * @Description
 */
//创建节点Eg3
public class Eg3 {
    //用于储存数据
    Object data;
    //储存下一个节点的引用
    Eg3 next;

    //有参构造器 方便创建节点对象时传入数据
    public Eg3(Object data){
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Eg3 getNext() {
        return next;
    }

    public void setNext(Eg3 next) {
        this.next = next;
    }
}

//链表
class Eg3Table{
    Eg3 root;

    //添加元素
    public void add(Object data){
        Eg3 eg3 = new Eg3(data);
        if (root == null){
            root = eg3;
        }else{
            Eg3 temp = root;
            //寻找最后一个节点
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = eg3;
        }
    }
    public Object print(){
        if(root != null){
            while (root != null){
                System.out.println(root.data);
                root = root.getNext();
            }
            return root;
        }else{
            return null;
        }
    }
}

class Test{
    public static void main(String[] args) {
        Eg3Table l1 = new Eg3Table();
        l1.add(1);
        l1.add(2);
        l1.print();
    }
}
