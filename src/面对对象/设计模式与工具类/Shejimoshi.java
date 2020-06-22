package 面对对象.设计模式与工具类;

import javax.tools.Tool;
import java.util.Arrays;

/**
 * 1.设计模式：多数人认可的
 *
 * 2.工具类：把经常使用的方法封装到工具类中
 *      提前写好的一些常用功能
 * 3.工具类经常使用的包名
 *      喜欢放在 util/utils，tool/tools
 * 4.如何设计工具类
 *      1），喜欢设计成静态方法
 *      2）. 如果没有static ，设计为单例
 *      3）. 如果工具类全是static修饰的，只需要用类名调用，
 *      此时必须把工具类的构造器私有化
 */
public class Shejimoshi {
    public static void main(String[] args) {
        //Arrays.sort();

    }
}

class Toolzhou{
    //创建对象
    private static Toolzhou tool=new Toolzhou();
    //私有化构造器(子类无法继承，因为构造方法无法被子类调用)
    private Toolzhou(){}
    //开放一个外部接口，可以拿到一个对象
    static Toolzhou getInstance(){
        return tool;
    }
}

