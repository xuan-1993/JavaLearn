package 面对对象.常用类;

/**
 * currentTimeMillis() 返回以毫秒为单位的当前时间。
 */
public class SystemMethod {
    public static void main(String[] args) {
        //从1970年到现在的毫秒数
        //一般用于测试，判断执行效率
        long time=System.currentTimeMillis();
        System.out.println(time);
    }
}
