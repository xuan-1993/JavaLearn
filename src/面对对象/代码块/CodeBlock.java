package 面对对象.代码块;

/**
 * 代码块：
 * 在类中直接使用花括号括起来的代码块
 * 如：{}
 *
 * 1.局部代码块: 定义在方法内部的代码块
 *      在调用方法时候执行
 * 2.初始化代码块：直接在类中定义的代码块
 *      在运行时，还是把他放到构造方法内，在创建实例的时候调用构造方法
 * 3.静态代码块：初始化代码块代码块千面加上static
 *      在什么时候执行？
 *      属于类，所以在加载字节码的时候就会自动调用
 *      在主方法main之前执行了，只执行一次
 */

public class CodeBlock {

    static{
        System.out.println("静态代码块执行了");
    }
    //每创建一个对象，就会调用一次
    {
        //代码块的变量为局部变量，作用域为本块
        //初始化代码块
        int a=10;
        System.out.println("初始化代码块执行了");
    }

    CodeBlock(){
        System.out.println("-----");
    }

    void xuans(){

        {
            //局部代码块（if语句中的）
            int x;
        }
    }

    public static void main(String[] args) {
        System.out.println("main执行了");
        new CodeBlock();
        new CodeBlock();
        new CodeBlock();
    }
}
