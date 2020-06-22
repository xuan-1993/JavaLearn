package 面对对象.异常;


/**
 * 三种方式
 * 1.sys(e.getMessage())
 * 2.sys(e.toString())
 * 3.e.printStackTace()
 */
public class GetExceptionDemo {
    public static void main(String[] args) {
        try {
            int a=10/0;
        }catch (Exception e){ //new ArithmeticException();
            e.printStackTrace();
        }


    }
}
