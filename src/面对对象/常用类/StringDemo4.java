package 面对对象.常用类;

/**
 * indexof
 * lastindexof
 * toLowerCase
 * split分割字符串
 * startSWith 以...字符开头
 * subString 从指定位置开始截取字符串
 * trim(): 去除首位空格“ absc ess ” ，不能去掉中间的空格
 */

/**
 * 创建一个工具类
 *
 */

public class StringDemo4 {

    //字符串工具类
    static boolean haslength(String str){
        return str != null && !"".equals(str.trim());
    }
    public static void main(String[] args) {
        char[] cs=new char[]{'a','b','c'};
        String str=new String(cs);

        System.out.println(haslength(str));
    }
}
