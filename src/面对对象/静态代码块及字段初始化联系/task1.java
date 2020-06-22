package 面对对象.静态代码块及字段初始化联系;

import javax.annotation.processing.SupportedSourceVersion;

/**
 * 1.类的加载：第一次创建对象时候加载进JVM
 *      加载时，会执行Static代码块
 *
 * 2.字段初始化问题
 *    静态字段初始化：静态代码块
 *   非静态字段初始化：构造方法中执行
 *
 * 3.子类默认调用父类的构造方法
 */
public class task1 {
    private static task1 xq=new task1();
    private SubClass sub= new SubClass();
    
    static{
        System.out.println(3);
    }
    
    public task1(){
        System.out.println(4);
    }

    public static void main(String[] args) {
        System.out.println("main");
    }
}

class SuperClass{
    SuperClass(){
        System.out.println("构造器的SuperClass");
    }
}

class SubClass extends SuperClass{
    static {
        System.out.println(1);
    }
    SubClass(){
       // super();
        System.out.println(2);
    }
}