package 面对对象.常用类;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 常用类中常用的方法
 * java.lang  是不需要导入了
 * 常用类一般都不允许你创建对象，都私有化构造器
 * 
 *
 * arraycopy
 src - 源数组。
 srcPos - 源数组中的起始位置。
 dest - 目标数组。
 destPos - 目标数据中的起始位置。
 length - 要复制的数组元素的数量。 
 */
public class ArrayCopy {
    public static void main(String[] args) {
        int[] src = {1,2,3,4,5,6};
        int[] dest=new int[10];
        System.arraycopy(src,0,dest,1,6);
        System.out.println(Arrays.toString(src));
        System.out.println(Arrays.toString(dest));
        
    }
}
