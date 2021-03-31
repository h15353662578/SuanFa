package com.hs.day1;

/**
 * @author Huasheng
 * @Date 2021/03/31/19:53
 * @Description
 */
class Work1 {
    String data1;
    Work1 next1 = null;

    Work1(String data1){
        this.data1=data1;
    }

    public Work1 getNext1() {
        return next1;
    }

    public void setNext1(Work1 next1) {
        this.next1 = next1;
    }
}


class WorkT1{
    Work1 root1;

    public void add1(String data1){
        Work1 work1 = new Work1(data1);
        if (root1 ==null){
            root1 = work1;
        }else{
            Work1 temp1 = root1;
            while (temp1.next1 !=null){
                temp1 = temp1.next1;
            }
            temp1.next1 = work1;
        }
    }

    public Object print() {
        if (root1 == null) {
            return null;
        }
        while (root1 != null) {
            System.out.println(root1.data1);
            root1=root1.getNext1();
        }
        return null;
    }
}
class Test3{
    public static void main(String[] args) {
        WorkT1 t1 = new WorkT1();
        t1.add1("1");
        t1.add1("2");
        t1.add1("3");
        t1.print();
    }
}





class Work2{
    String data2;
    Work2 next2 = null;

    public Work2 getNext2() {
        return next2;
    }

    Work2(String data2){
        this.data2=data2;
    }
}
class WorkT2{
    Work2 root2;

    public void add(String data2){
        if (root2 == null){
            Work2 work2 = new Work2(data2);
            root2 = work2;
        }else {
            Work2 work2 = new Work2(data2);
            Work2 t1 = root2 ;
         while (t1.next2!=null){
             t1=t1.next2;
         }
         t1.next2 = work2;
        }

    }
    public void println2(){
        if (root2==null){
            return;
        }
        while (root2!=null){
            System.out.println(root2.data2);
            root2 = root2.getNext2();
        }
        return ;
    }
}

class Test4{
    public static void main(String[] args) {
        WorkT2 t2 = new WorkT2();
        t2.add("2");
        t2.add("3");
        t2.add("7");
        t2.println2();
    }
}
