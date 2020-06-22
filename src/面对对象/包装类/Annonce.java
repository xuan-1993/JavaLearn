package 面对对象.包装类;

/**
 * 基本数据类型与包装类型区别
 * 1.在类实例化过程中有默认值
 * int 0
 * Integer null
 * <p>
 * 2.包装提供了很多方法提供给我们使用可以通过API来查询
 * <p>
 * <p>
 * 3.集合框架(只能存对象，不能存基本数据类型)
 * 把数据全部集合到一起
 * <p>
 * 4.什么时候使用基本数据类型，什么时候使用包装类
 * 在类当中，成员变量一般使用包装类型；（堆里面）
 * 在方法当中，局部变量使用基本数据类型 （方法的基本类型存在栈里面）
 */
public class Annonce {
    public static void main(String[] args) {
        //valueOf缓存数据有一个范围
        Integer i1 = Integer.valueOf(2000);
        Integer i2 = Integer.valueOf(2000);
        System.out.println(i1 == i2);

        new Character('A');//缓存设计0-128

    }
}
