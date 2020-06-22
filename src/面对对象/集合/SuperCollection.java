package 面对对象.集合;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 学习collection接口
 * 1.看文档
 * 2.实践
 */

final class Student {

}

public class SuperCollection {
    public static void main(String[] args) {
        /*//多态写法，面向对象编程
        Collection c = new ArrayList();
        boolean i = c.add("abc");
        boolean i1 = c.add(10);//语法糖会自动装箱

        //add一直返回true
        boolean i2 = c.add(new Student()); //扔进去一个对象
        System.out.println(""+i + i1 + i2);

        System.out.println("----");
        Collection c2=new ArrayList();
        c2.add("a");
        c2.add("b");
        c2.add("c");

        //collection 移除指定的元素
        c2.remove("a");
        //清空集合所有内容
        c2.clear();
        System.out.println(c2);
        //获取集合的长度
        System.out.println(c2.size());
        
        //判断是否为空
        System.out.println(c2.isEmpty());*/

        /**
         *  遍历一个集合
         */
        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add(new Dog("王朝"));
        c.add(new Dog("马面"));

        //toArray自动把数组当中所有元素向上转型成Object类型
        Object[] c1 = c.toArray();
        for (Object cx : c1) {
            //向下转型
            if(cx instanceof Dog) {
                Dog d = (Dog) cx;
                System.out.println(d.getName());
            }
        }


    }
}

class Dog {
    private String name;

    Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}


