package com.hs.day1;

/**
 * @author Huasheng
 * @Date 2021/03/31/16:51
 * @Description
 */
public class Eg4 {
    String data;
    Eg4 next;

    public Eg4(String data){
        this.data=data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Eg4 getNext() {
        return next;
    }

    public void setNext(Eg4 next) {
        this.next = next;
    }

}
class Eg4Table{

    Eg4 root;

    public void add(String data){
        Eg4 eg4 = new Eg4(data);
        if (root == null ){
            root = eg4;
        }else{
            Eg4 temp =  root;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = eg4;
        }
    }

    public Object print(){
        if(root !=null ){
            while (root !=null){
                System.out.println(root.data);
                root = root.getNext();
            }
            return root;
        }else{
            return null;
        }
    }
}

class Test1{
    public static void main(String[] args) {
        Eg4Table t1 = new Eg4Table();
        t1.add("李");
        t1.add("龙");
        t1.add("S");
        t1.add("B");
        t1.print();
    }

}