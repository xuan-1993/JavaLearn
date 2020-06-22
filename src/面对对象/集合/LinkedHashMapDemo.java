package 面对对象.集合;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedmap=new LinkedHashMap<>();
        //怎么放就是怎么样，有序性

        linkedmap.put("I",5);
        linkedmap.put("M",4);
        linkedmap.put("L",1);
        System.out.println(linkedmap);
    }
}
