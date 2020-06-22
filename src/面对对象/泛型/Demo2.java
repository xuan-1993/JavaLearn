package 面对对象.泛型;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {

        //数组转集合
        int[] arr={10,10,20};

        List<int[]> list = Arrays.asList(arr);

        //不支持转成添加和删除
        //list.add(10);
        
        //基本数据类型，转成集合时，把基本数据类型的数组，当做一个对象
        //开发当中不会吧基本数据类型转化成集合
        System.out.println(list.getClass());
        System.out.println("-----------------");
        
        //引用数据类型的数组才会转成集合
        Integer[] arr2={10,20,30};
        List<Integer> list2= Arrays.asList(arr2);
        System.out.println(list2);

        /**
         * 集合转数组
         */
        List<String> list3=new ArrayList<>();
        list3.add("1234");
        list3.add("5213");
        Object[] o=list3.toArray();

        //静态开辟空间，如果开辟的空间小于size，会自动填充为size
        //如果开辟了一个大于空间多余的为null
        String[] str=list3.toArray(new String[0]);
        String[] str1=list3.toArray(new String[10]);
        System.out.println(Arrays.toString(str1));
        System.out.println(Arrays.toString(str));
    }
}
