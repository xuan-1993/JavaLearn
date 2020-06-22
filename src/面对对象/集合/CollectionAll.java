package 面对对象.集合;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection 集合带all 常用方法？
 * <p>
 * 1.addAll //添加所有的对象 ，返回布尔
 * 2.removeAll //删除交集返回布尔
 * 3.containAll //判断是否包含另外一个集合，子集，返回布尔
 * 4.retainAll //取交集，返回布尔：如果此 collection 由于调用而发生更改，则返回 true
 */
public class CollectionAll {
    public static void main(String[] args) {

        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");

        //转成数组
        Object[] arr = c.toArray();
        Iterator it=c.iterator();
        Object it1=it.next();
        System.out.println(it1);
        boolean b1=it.hasNext();
        System.out.println(b1);
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Collection c1=new ArrayList();
        c1.add(new CatDemo("xiaohong"));
        c1.add(new CatDemo("xiaobai"));
        Iterator it2=c1.iterator();
        System.out.println(it2.getClass());
        while(it2.hasNext()){
            //记得it.next()迭代器，会返回一个Object类型的实例
            Object p1=it2.next();
            CatDemo cat=(CatDemo) p1;
            cat.miao();
        }


    }
}

class CatDemo{
    private String name;
    CatDemo(String name){
        this.name=name;
    }
    void miao(){
        System.out.println("miaomiao");
    }

    @Override
    public String toString() {
        return "CatDemo{" +
                "name='" + name + '\'' +
                '}';
    }
}
