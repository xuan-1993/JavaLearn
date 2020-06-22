package 面对对象.集合;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LIstDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        //index必须小于等于size
        list.add(1, "hhhh");
        //打印list
        //System.out.println(list);

        //获取集合个数
        //System.out.println(list.getClass());

        /*
        //根据角标获取值
        System.out.println(list.get(0));
        
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }*/


        //等于a就删除其
        ListIterator it = list.listIterator();
        System.out.println(it.getClass());
        while (it.hasNext()) {
            String str = (String) it.next();
            //判断元素是否为2
            /*if (str.equals("a")) {
                //ConcurrentModificationException
                //并发修改异常，不能直接在遍历迭代器的时候通过list删除元素
                //可以通过迭代器自身的删除方法
                //if (modCount != expectedModCount)
                //list.remove("a");
                it.remove();
                //想要添加一个元素

                //modCount增加了，但是expectedModCount 没有改变
                it.add("list");
            }*/
        }
        //重后向前，倒叙遍历
        while(it.hasPrevious()){
            System.out.println("preIndex="+ it.previousIndex());
            System.out.println(it.previous());
        }

        System.out.println(list);
    }
}
