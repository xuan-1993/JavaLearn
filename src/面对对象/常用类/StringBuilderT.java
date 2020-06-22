package 面对对象.常用类;

/**
 * 不可变字符串：定义好了字后，就不能再去改变了，内存地址不能改变
 * 可变的字符：性能高一些
 * 定义好了还可以修改，不会创建新的内存地址
 *
 * StringBuilder 没有加锁，效率高一些
 * StringBuffer  加了synchronized 加锁更安全 效率低一点
 *
 * String < StringBuffer <StringBuilder
 * 安全性StringBuffer更高
 *
 */
public class StringBuilderT {
    static void StringTask(){
        long begin=System.currentTimeMillis();

        String str="";
        for(int i = 0 ;i<=100000;i++){
            str+=i;
        }
        long last=System.currentTimeMillis();
        System.out.println(last-begin);
    }

    static void StringBuilderTask(){
        long begin=System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append(i);
        }

        long last=System.currentTimeMillis();
        System.out.println(last-begin);
    }

    static void StringBuffertask(){
        long begin=System.currentTimeMillis();
        StringBuffer StrBuffer=new StringBuffer();
        for (int i=0;i<=1000000;i++){
            StrBuffer.append('a');
        }
        long last=System.currentTimeMillis();
        System.out.println(last-begin);
    }


    /**
     * StringBuilder本质是一个byte类型数组
     * @param args
     */
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(); // 本质是new了一个char类型的数组
        StringBuilder sb1=new StringBuilder(16);

        //初始化的字符串
        StringBuilder sb2=new StringBuilder("hello");
        
        //链式编程
        sb2.append(123).append("234");

        //可变字符串转成不可变字符串
        String s=sb.toString();
        String.valueOf(1213);

        System.out.println(sb2);
    }
}
