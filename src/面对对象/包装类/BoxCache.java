package 面对对象.包装类;

/**
 * 包装类valueof缓存数据
 */
public class BoxCache {
    public static void main(String[] args) {
        //i1,i3表示两个新开辟的内存地址
        Integer i1=new Integer(12);
        Integer i3=new Integer(12);


        Integer i2=Integer.valueOf(1234);
    }
}
