package 面对对象.包装类;

/**
 * 拆箱操作
 */
public class ChaiBox {
    public static void main(String[] args) {
        //装箱操作
        Integer num1=new Integer(10);
        Integer num2=Integer.valueOf(15);

        //拆箱操作：把包装类的对象转换为对应的基本类型的操作
        int num2to=num2.intValue();
        System.out.println(num2.toString());
        System.out.println(num2to);

        //long的装拆箱子
        Long lg1=new Long(10);
        long lg2=lg1.longValue();

        //char的装拆箱
        Character a=new Character('A');
        char a1=a.charValue();
    }
}
