package 面对对象.集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 迭代器遍历
 */

class Cat{
    private String name;
    Cat(String name){
        this.name=name;
    }
    void show(){
        System.out.println(name+"hhhhhhh");
    }
}

public class DdqCollection {
    public static void main(String[] args) {
        /*Collection c=new ArrayList();
        c.add(111);
        c.add("234");
        c.add("aaaa");

        //toArray遍历
        Object[] cx=c.toArray();
        Iterator cy=  c.iterator();
*/
        /*//next指向下一个有指针,相当于没有指针
        Object obj1=cy.next();
        Object obj2=cy.next();
        Object obj3=cy.next();
        if(cy.hasNext()) {
            Object obj4 = cy.next();
        }
        System.out.println(""+obj1+" "+obj2+" "+obj3 );*/


        //遍历
        //迭代器相当于自增的形式遍历，现将所有内容复制出来给迭代器类
        //取出一个扔一个
       /* while(cy.hasNext()){
            //System.out.println(cy.next());
        }*/

        Collection c2=new ArrayList();
        System.out.println(c2.getClass());
        c2.add(new Cat("娃娃"));
        c2.add(new Cat("布娃娃"));
        c2.add(new Cat("娃娃"));

        Iterator cy1=c2.iterator();//里面的对象会自动提升为Object
        System.out.println(cy1.getClass());
       /* while(cy1.hasNext()){
            Cat c3=(Cat)cy1.next();//转型成对应的对应的对象类型
//            c3.show();
        }

*/


    }
}
