package 面对对象.OBJECT类;

/**
 * object？一个类的直接父类或者间接父类
 * object类继承后可以用其所有的方法
 *
 *
 */
public class LnObject extends Object {
    String name;
    int age;

    /*@Override
    public String toString() {
        return "LnObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/

    public static void main(String[] args) {
        var zx=new LnObject();
        zx.name="zhou";
        zx.age=1;
        LnObject zx1=zx;
        //object的equals判断两个对象内存地址
        zx.getClass();//获取当前类的真实类型

        System.out.println(zx.getClass());
        System.out.println(zx.toString());
        System.out.println(zx);
    }
}
