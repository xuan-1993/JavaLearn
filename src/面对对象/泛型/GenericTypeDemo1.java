package 面对对象.泛型;

import java.util.ArrayList;
import java.util.List;

/**
 * 通配符：不知道用什么接受时，用？标识未知
 */
public class GenericTypeDemo1 {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        List<Object> n=new ArrayList<>();
        test1(l);
        //test1(n);
        test2(n);
        //test2(l);
    }

    //并不知道要传入的集合是什么类型所以加个问好
    static void test(List<?> list){
        System.out.println(list.toString());
    }

    //并不知道要传入的集合是什么类型所以加个问好
    //<=Number
    static void test1(List<? extends Number> list){
        System.out.println(list.toString());
    }

    //>+Number
    static void test2(List<? super Number> list){
        System.out.println(list.toString());
    }

}
