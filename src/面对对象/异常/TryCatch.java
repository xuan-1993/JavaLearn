package 面对对象.异常;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class TryCatch {
    /**
     * 自己处理异常
     * <p>
     * try---catch only one NUll
     */
    public static void main(String[] args) {

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[4]);
            System.out.println("1213");
            int a = 10 / 0;
            System.out.println(a);

            //不同的异常可以用多个catch处理
        }

        //JDK7后可以这么写，多个异常捕获
        catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e);
        }

        //可以直接写一个catch Exception
        /*catch (Exception e){
            System.out.println(e);
        }*/ finally {
            System.out.println("1111111111");
        }
        System.out.println("3333333333");
    }
}
