package 面对对象.异常;

/**
 * throw抛出异常
 * 1.抛出运行时异常
 * 2.抛出编译时异常
 */

/**
 * throws 抛出异常
 * 跟在方法定义之后，可以跑出多个异常，用逗号隔开
 * 其他的异常用Exception
 */
public class ThrowDemo {
    public static void main(String[] args) {
        try {
            age(-1);
        } catch (Exception e) {
            e.printStackTrace();
            //System.exit(0);
            return;
        }finally {
            //一般不做return，一般只做释放资源的操作

        }
    }
    public static void age(int  a) throws Exception {
        if(a>0 && a<100){
            a=a+1;
        }else{
            System.out.println("年龄错误");

            //运行时异常抛出
            //throw new RuntimeException("年龄错误");

            //抛出编译时异常,必须有人处理
            //不捕获继续往上抛
            throw new Exception("1234");
        }
    }
}
