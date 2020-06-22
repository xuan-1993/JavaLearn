package 面对对象.枚举;

//定义一个星期几的常量类
/*class WeekDay{
    public static final WeekDay MONDAY=new WeekDay();
    public static final WeekDay TUESDAY=new WeekDay();;
    public static final WeekDay WENDESDAY=new WeekDay();;
    public static final WeekDay THURSDAY=new WeekDay();;
    public static final WeekDay FRIDAY=new WeekDay();;
    public static final WeekDay SATURDAY=new WeekDay();;
    public static final WeekDay SUNDAY=new WeekDay();;
}*/
//

/**
 * 反编译后
 * final class WeekDay extends Enum
 * 本质上继承一个Enum
 *
 */
enum WeekDay{
    MONDAY,TUESDAY,WENDSDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
/**
 * 枚举
 * 表示一个事务的固定状态（春夏秋冬）
 * Java中枚举
 *  一个特殊的类，多个常量对象的集合
 *
 *
 * 【修饰符】 enum 枚举的名称{
 *     常量1,常量2,常量3.....
 * }
 */

class Student{
    private WeekDay restDay;

    public WeekDay getRestDay() {
        return restDay;
    }

    public void setRestDay(WeekDay restDay) {
        this.restDay = restDay;
    }
}



public class HelpKnow {
    public static void main(String[] args) {
        //最终修改后代码很烂
        Student in=new Student();
        /*in.setRestDay(WeekDay.SATURDAY);
        in.setRestDay(8);
        int res=in.getRestDay();*/
        in.setRestDay(WeekDay.MONDAY);
        if(in.getRestDay()==WeekDay.SATURDAY || in.getRestDay()==WeekDay.SUNDAY){
            System.out.println(in.getRestDay());
        }
    }
}
