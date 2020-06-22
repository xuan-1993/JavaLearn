package 面对对象.常用类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class DateUtil {
    private static final String DEFAIL_PATTERN = "yyyy-MM-dd hh:mm:dd";

    private DateUtil() {
    }

    public static DateUtil getInstance() {
        return new DateUtil();
    }

    //需求：把日期转成字符串
    public static String dataToString(Date date) {
        return DateUtil.dataToString(date, "");
    }

    public static String dataToString(Date date, String pattern) {

        SimpleDateFormat sd = new SimpleDateFormat();
        if (DateUtil.isBlank(pattern)) {
            pattern = DEFAIL_PATTERN;
        }
        sd.applyPattern(pattern);
        return sd.format(date);
    }

    //如果不为空返回true
    public static boolean hasLength(String str) {
        return str != null && !"".equals(str.trim());
    }

    //如果为空返回true
    public static boolean isBlank(String str) {
        return !DateUtil.hasLength(str);
    }

    //需求2：字符串转成日期
    public static Date StringToDate(String str, String pattern) throws ParseException {
        SimpleDateFormat sd = new SimpleDateFormat();
        if (DateUtil.isBlank(pattern)) {
            pattern = DEFAIL_PATTERN;
        }
        sd.applyPattern(pattern);
        return sd.parse(str);
    }
}
