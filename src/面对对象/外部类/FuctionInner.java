package 面对对象.外部类;

/**
 * 局部内部类：定义在方法当中
 *
 * 1.局部内部类的不能加修饰符public
 * 2.不能定义静态成员
 * 3.局部内部类中可以包含局部变量，必须用final 常量（因为final类型的变量常驻方法区里
 * java虚拟机关闭的时候才销毁）
 */

class FInner{
    void zx(){
        //会自动转型成final类型，因为被局部内部类中处于堆中
        String name="哈哈哈";
        //Inner
        class Inner{
            //不能定义static，因为静态成员属于类的
            //static int i=10;
            void test1(){
                System.out.println(name);
            }
        }

        Inner in=new Inner();
        in.test1();
    }
}
public class FuctionInner {
    public static void main(String[] args) {
        new FInner().zx();

    }
}
