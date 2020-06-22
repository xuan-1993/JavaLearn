package 面对对象.常用类;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        var data=new Date();
        System.out.println(data);
        System.out.println(data.getTime());
//        System.currentTimeMillis();
/*
        //生成验证码
        String res = UUID.randomUUID().toString();
        System.out.println(res);
        System.out.println("-------------");
        
        String str="ABCDEFGHIGKLMNOPQRSTUVWXYZ";
        str=str + str.toLowerCase();
        str+="0123456789";
        System.out.println(str);
        
        //生成0-62的值
        System.out.println(str.length());
        int x=new Random().nextInt(str.length());
        System.out.println(str.charAt(x));
        System.out.println(data.toLocaleString());*/

        //获取为日期和时间使用SHORT 风格的默认日期/时间格式器
        DateFormat df= DateFormat.getDateInstance();
        //对指定的日期进行格式化
        String time=df.format(data);
        System.out.println(time);

        System.out.println("---------------");

        //长日期：LONG
        //短日期：SHORT
        DateFormat df2=DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.LONG);
        String time2=df2.format(data);
        System.out.println(time2);
        
        //日期转字符串
        DateFormat df4=DateFormat.getDateInstance();
        String time4=df4.format(data);
        System.out.println(time4);

        //把一个字符串转日期
        DateFormat df5=DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.LONG);
        String newStr="2020年1月2日 下午02时45分49秒";
        Date date2=df5.parse(newStr);
        System.out.println(date2);


    }
}
