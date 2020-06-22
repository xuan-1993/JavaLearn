package 面对对象.泛型;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型擦除
 *
 */
public class GenericKill {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("aa");


        List list2=null;
        //定义的时候没有泛型，赋值后，不会有泛型
        list2=list;
        Integer.valueOf(1);
        list2.add(10);
        list2.add("Stri123");

    }
}
