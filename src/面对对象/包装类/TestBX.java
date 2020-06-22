package 面对对象.包装类;

/**
 * 装箱：把基本数据类型变成包装类
 */
public class TestBX {
    public static void main(String[] args) {
         int a=10;

         //把基本数据类型变成成对象,
         Integer inta1=Integer.valueOf(20);
         Integer inta=new Integer(a);
         //经过包装后有很多方法可以用了
         System.out.println(inta.TYPE);

         double b=13.5;
         Double.valueOf(b);
    }
}
