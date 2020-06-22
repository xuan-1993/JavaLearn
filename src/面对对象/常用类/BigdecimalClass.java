package 面对对象.常用类;

import java.math.BigDecimal;
/**
 * bigdecimal:大精度的，用于金钱的
 * 精确小数 （进度要求高）
 */
public class BigdecimalClass {
    public static void main(String[] args) {
        System.out.println(0.09+0.01);

        //表示金钱的用BigDecimal
        System.out.println(new BigDecimal("0.09"));

    }
}
