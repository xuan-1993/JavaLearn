package 面对对象.包装类;

/**
 * 文档的使用
 * JDK 1.6 有中文版
 *
 * CHM类型文件
 * JDK API 1.6.0 中文版
 */
public class UseFile {
    public static void main(String[] args) {
        int a=10;
        String b="123";
        var p1=Integer.valueOf(a);

        //字符串中表示一个数字
        var p2=new Integer(b);
        System.out.println(p2.compareTo(122));

        var d1=new Double(2.23333);
        System.out.println(d1.SIZE);
    }
}
