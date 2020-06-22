package 面对对象.final关键字;

/**
 * FINAL:解决的问题：不想让子类去修改父类的方法，但是允许访问
 *
 * final:
 * 修饰字段：不能再修改该字段,但是需要初始化
 *          1.final修饰字段时，需要初始化
 *
 * 修饰方法：子类不可修改
 * 修饰类： 不允许继承
 *
 * 变量： 2.相当于是一个常量（一般变量名为大写）
 *  *    3.如果修饰的是一个基本数据类型，代表值不能再修改
 *  *    4.如果修改的是一个引用类型，代表内存引用不能再修改
 */
class SuperClass{
    final int MAX_X=1;
    final void test(){
        System.out.println(1);

    }
}

//继承的优点：节省代码
//继承的缺点：破坏了封装
//2.继承会覆盖父类的方法
class SubClass extends SuperClass{
    //父类的test（）方法定义为fianl
/*    void test(){
        System.out.println(2);
    }*/
}


public class Guanjianzhi {
    public static void main(String[] args) {
        final var sup=new SuperClass();
        sup.test();
        int a=sup.MAX_X;
        //sup=new SuperClass();

    }
}
