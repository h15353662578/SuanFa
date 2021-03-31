package com.hs.day1;

/**
 * @author Huasheng
 * @Date 2021/03/31/19:41
 * @Description
 */
public class Eg5 {
    String data;
    Eg5 next = null;

    public Eg5(String data){
        this.data=data;
    }

    @Override
    public String toString() {
        return "Node [data=" + data + ", next=" + next + "]";
    }

}

class Eg5Tbale{

    Eg5 root;

    public void add(String data){
        Eg5 eg5 = new Eg5(data);
        if (root == null){
            root = eg5;
        }else {
            Eg5 temp = root;
            while (temp.next !=null){
                temp = temp.next;
            }
            temp.next = eg5;
        }
    }

    @Override
    public String toString() {
        return "Eg5Table [root=" + root + "]";
    }

}

class Test2{
    public static void main(String[] args) {
        Eg5Tbale t1 = new Eg5Tbale();
        t1.add("李");
        t1.add("龙");
        t1.add("天");
        t1.add("二");
        System.out.println(t1);
    }

}
