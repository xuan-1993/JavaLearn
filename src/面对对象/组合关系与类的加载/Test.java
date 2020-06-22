package 面对对象.组合关系与类的加载;


/**
 * 1.组合类型：自己当中的字段是一个类类型
 * 2.类的加载时机：第一次使用类对象的时候，加载到JVM内存中
 */
class Dog{
    static {
        System.out.println("dog 加载了");
    }
    String name;
}

class Person{
    static {
        System.out.println("Person 加载了");
    }
    String name;
    int age;
    Dog pet; //组合类型：自己当中的字段是一个类类型 --依赖其他的类
}
public class Test {
    static {
        System.out.println("Test加载了");
    }
    //一个人有一条狗
    public static void main(String[] args) {
        var p1=new Person();
        p1.name="zs";
        var dog=new Dog();

        var p2=new Person();
        var dog1=new Dog();
       /* dog.name="wangcai";

        p1.pet=dog;

        System.out.println(p1.pet.name);*/
    }
    
}
