package 面对对象.包装类;

/**
 * 自动装拆箱
 * 自动装箱：把基本数据类型的值赋值给包装类对象
 * 无非是写法上简洁一点点--语法糖，不建议这么写
 * 自动拆箱：可以直接把一个包装类对象赋值给基本数据类型的变量
 */
public class AutoBox {
    public static void main(String[] args) {
        Integer i=20; //个人不建议这么写
        int i1=i;
    }
}
