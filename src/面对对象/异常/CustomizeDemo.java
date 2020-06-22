package 面对对象.异常;

/**
 * 自定义异常
 */

/**
 * 一般选择继承RuntimeException类
 *
 */
public class CustomizeDemo {
    public static void main(String[] args) throws ZxException {
        // 带参数的异常，如果是自己写的类要继承并覆盖参构造器
        // throw new ZxException("aaaa");
    }

}

class ZxException extends RuntimeException{

    ZxException(String s) {
        super(s);
    }
}