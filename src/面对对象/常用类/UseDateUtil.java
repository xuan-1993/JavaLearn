package 面对对象.常用类;

import java.text.ParseException;
import java.util.Date;

public class UseDateUtil {
    public static void main(String[] args) throws ParseException {
        
        System.out.println(DateUtil.dataToString(new Date(),"yyyy"));
        String strdate1=DateUtil.dataToString(new Date(),"");
        System.out.println(strdate1);
        System.out.println(DateUtil.dataToString(new Date()));
        
        System.out.println(DateUtil.StringToDate("2020年",""));
    }
}
