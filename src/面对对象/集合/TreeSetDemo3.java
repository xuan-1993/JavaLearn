package 面对对象.集合;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        
        TreeSet<String> set=new TreeSet<>(new CompareLength());
        set.add("aaaa");
        set.add("a1");
        set.add("a3");
        set.add("a2");
        set.add("myx");
        set.add("cba");
        System.out.println(set);


        //使用一个比较器进行比较
        //1.实现一个借口comparator
        //2.定义一个类来实现接口
        //3.覆盖其内部方法
    }
}

class CompareLength extends Object implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
        int length=o1.length() -o2.length();
        //compare length
        return length==0 ? o1.compareTo(o2):length;
    }
}
