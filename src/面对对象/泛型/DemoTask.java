package 面对对象.泛型;

import java.util.ArrayList;
import java.util.List;

/**
 * 需求：学科里有很多班级，班级里有很多学生
 */

class Person{
    private String name;
    Person(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
public class DemoTask {
    public static void main(String[] args) {
        Person p1=new Person("xiaohong");
        Person p2=new Person("二哈");
        List<Person> list1 =new ArrayList<>();
        list1.add(p1);
        list1.add(p2);

        Person p3=new Person("3333");
        Person p4=new Person("4444");
        List<Person> list2 =new ArrayList<>();
        list2.add(p3);
        list2.add(p4);

        //学科有很多班级，集合里存放集合
        List<List<Person>> x=new ArrayList<>();
        x.add(list1);
        x.add(list2);


        //把所有班级的学生姓名打印出来
        //遍历循环嵌套
        for(List<Person> c: x){
            for (Person p:c){
                System.out.println(p.getName());
            }
        }
    }
}
