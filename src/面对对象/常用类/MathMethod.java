package 面对对象.常用类;
import java.lang.Math;
/**
 *Math
 *
 * random:返回带正号的 double 值，该值大于等于 0.0 且小于 1.0
 *
 * qurt:public static double sqrt(double a)
 */
public class MathMethod {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);
        //求两个数的最大值
        int a=Math.max(10,20);

        //返回0到10的随机整数
        System.out.println((int)(Math.random()*100000));
        System.out.println(Math.sqrt(25.0));
    }
}
