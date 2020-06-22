package 面对对象.集合;


import java.util.ArrayList;
import java.util.ListIterator;

/**
 * ArrayList数组添加和删除原理，
 * 动index 角标下的数据
 * 会影响size-index个元素
 */
public class ArrayListDemo2 {
    /**
     * 给一个集合，专门去除重复元素
     *
     * @param list
     */
    static ArrayList getSingleEle(ArrayList list) {
        ArrayList newList = new ArrayList();
        ListIterator it = list.listIterator();
        while (it.hasNext()) {
            Object obj = it.next();
            if (!newList.contains(obj)) {
                newList.add(obj);
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        //需求：去除arraylist中的重复元素
        ArrayList a1 = new ArrayList();
        a1.add("a");
        a1.add("b");
        a1.add("c");
        a1.add("d");
        a1.add("d");
        System.out.println(a1);
        System.out.println(getSingleEle(a1));


    }
}
