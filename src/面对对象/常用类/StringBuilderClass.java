package 面对对象.常用类;

/**
 * 字符串本质：char类型数组
 * 1.不可变字符串String（内存地址不可变）
 * 2.可变字符串
 *
 * //字符串对象值为空
 * 1.表示引用为空 String str=null; 还没有初始化，没有分配内存空间
 * 2.表示空字符串 String str="",已经创建了对象，已经分配了内存，内容为空
 *
 * 字符串比较
 * 比较两个字符串想不想等
 * 1.==  比较两个内存地址是否相等
 * 2. 使用equals 它是在Object  和==相同
 *      如果覆盖了equals方法，就可以自己去根据需求判断
 */
public class StringBuilderClass {
    public static void main(String[] args) {

        String str="ABC";
        str="cd";

    }
}
