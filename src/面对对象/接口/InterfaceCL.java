package 面对对象.接口;

import com.sun.tools.javac.Main;

/**
 * 面向接口编程
 * 把实现类对象复制给接口类对象
 * <p>
 * 好处？
 * 多态的好处：屏蔽了不同类自检的实现差异，从而达到通用编程
 * 接口的好处：类似于多态，达到了一个通用编程
 */

//Usb 例子

/**
 * interface Iusb
 * {
 * 	public static final int i = 0;
 * 	public abstract void swapData();
 * }
 */
interface Iusb{
    int i = 0;
    void swapData();
}
class MainBoard {
    void pluginIn(Iusb usb) {
        usb.swapData();
    }
}

class KeyBoard implements Iusb{
    public void swapData(){
        System.out.println("打字");
    }
}

class Mouse implements  Iusb{
    public void swapData() {
        System.out.println("鼠标移动");
    }
}

public class InterfaceCL {
    public static void main(String[] args) {
        Iusb m = new Mouse();

        Iusb b = new KeyBoard();

        MainBoard n=new MainBoard();
        n.pluginIn(m);
        n.pluginIn(b);
    }
}
