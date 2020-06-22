package 面对对象.包装类;

/**
 * 字符串与包装
 * 如何把字符串装成包装类型? 首先要确定字符串里面到底有什么内容
 * 如果说是“ab1234.@”这怎么玩？
 */
public class String2Basic2Box {
    public static void main(String[] args) {
 
        //明确有字符串里面是int
        var i=new Integer("12345");
        String str=i.toString();
        System.out.println(str);

        //基本类型如何转字符串
        int a=10;
        String str2=a+"";

        //字符串转int
        String str3="200";
        int i3=Integer.parseInt(str3);

        //字符串转boolean
        String str4="TrUe";
        boolean b1=Boolean.parseBoolean(str4);
        System.out.println(b1);
    }
}
