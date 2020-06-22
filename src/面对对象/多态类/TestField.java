package 面对对象.多态类;

/**
 * 多态
 * 1.方法---覆盖，表现子类的特征
 * 2.字段---隐藏，不存在多态，编译时期就决定调用哪里的字段
 */
class SuperClass {
    String name = "Sup------";

    void run() {
        System.out.println("super====");
    }
}

class SubClass extends SuperClass {
    String name = "Sub-------";

    void run() {
        System.out.println("Sub=====");
    }
}

public class TestField {
    public static void main(String[] args) {
        SuperClass sub = new SubClass();
        sub.run();
        System.out.println(sub.name);//不管真实的类
    }
}
