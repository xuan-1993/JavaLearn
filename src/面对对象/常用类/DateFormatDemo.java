package 面对对象.常用类;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *自定义日期格式
 *
 */
public class DateFormatDemo {
    public static void main(String[] args) {
        var date1=new Date();

        SimpleDateFormat sd=new SimpleDateFormat();
        //定义自己想要的格式
        String pattern= "yyyy-MM-dd kk-mm-ss-SS z-D-F-E";
        sd.applyPattern(pattern);
        
        System.out.println(sd.format(date1));
        //



    }
}
