package 面对对象.单例设计模式;

import javax.tools.Tool;

/**
 * 设计模式：经过无数次的尝试，总结出的来的一套最佳写法
 *
 * 单例？？  --一个类在内存中只有一个对象，别人不能再创建对象
 *  为什么要有单例？  --开发中做一些工具类
 *
 *  饿汉模式：
 *  1.必须得在类中创建一个对象
 *  2.私有化构造器，防止外界通过构造器来创建新的对象
 *         不允许外界调用构造器
 *  3.给外界提供一个方法，能够获得创建好的对象
 *         通过static标识符，利用类名去拿对象
 */

class ToolUtil{
    //1.在该类中创建出一个对象出来
    private static ToolUtil instance= new ToolUtil();
    //2.私有化构造器
    private ToolUtil(){}
    //3.给外界提供一个方法
    static public ToolUtil getInstance(){
        return instance;
    }

    //工具方法1
    public void sort(){
        
    }

    //工具方法2
    public void fly(){

    }
}
public class SingleDesign {
    public static void main(String[] args) {
        ToolUtil tool1=ToolUtil.getInstance();
        ToolUtil tool2=ToolUtil.getInstance();
      //  ToolUtil tool3=new ToolUtil();
        System.out.println(tool1);
        System.out.println(tool2);
        
    }
}


