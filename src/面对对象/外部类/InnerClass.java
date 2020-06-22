package 面对对象.外部类;

/**
 * 内部类使用
 *
 * 实例内部类（属于对象的，不适用static修饰的内部类）
 *      需要创建对象的
 * 静态内部类
 *
 *
 */

class Outter{
    String name="OutName";
    static int age=101;
    //外部类不能调用内部类成员
    void test2(){
        System.out.println(age);
    }
    class Inner{
        String name="inname";
        int age=10;
        //实例内部类中不允许有static
        //static int i=10;
        void test(){
            System.out.println(this.name);
        }
        void test1(){
            //Outter.this 表示外部类的内存地址
            System.out.println(Outter.this.name);
        }
        void test3(){
            System.out.println(Outter.this.age);
        }
    }
}

class StaticOutter{
    String name="OutName";
    static int age=101;
    static class Inner{
        String name="inname";
        int age=10;
        static String color="balck";
        //实例内部类中不允许有static
        //static int i=10;
        void test(){
            System.out.println(this.name);
        }
        void test1(){
            //Outter.this 表示外部类的内存地址
          //  System.out.println(Outter.this.name);
        }

        //静态内部类不允许访问外部类的静态成员
        void test3(){
            System.out.println(new StaticOutter().age);
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        /*Outter out=new Outter();
        System.out.println(out.name);

        //创建对象里面有
        //对象.new Class (类型是Outter.Inner)
        Outter.Inner inner=out.new Inner();
        inner.test();
        inner.test1();*/

        //创建静态内部类
        
        StaticOutter.Inner in=new StaticOutter.Inner();

        System.out.println(in.name);
        System.out.println(StaticOutter.Inner.color);
    }

}
