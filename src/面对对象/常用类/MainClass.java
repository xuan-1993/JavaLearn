package 面对对象.常用类;


/**
 * main方法被JVM调用的方法：权限应该足够大
 */
public class MainClass {

    //public:被JVM调用的方法，权限应该要足够大
    //static: 被JVM调用的方法，不需要创建对象，直接使用类名调用
    //void: 被JVM调用的方法，不需要有任何的返回值
    //String[] args ：以前是指键盘录入，
    public static void main(String[] args){
        System.out.println(args.length);
    }
}
