package 面对对象.泛型;



class Point<T>{
    private int a;
    private  T b;
    Point(int a,T b){
        this.a=a;
        this.b=b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    
    //泛型方法:用于普通方法，不能用于静态方法
    //原因：静态方法直接使用类名调用，不用创建对象，
    //所以不知道是什么类型，这么定义没有意义
    
    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Point{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
    static <E> E test2(E name){
        System.out.println(name.getClass());
        return name;
    }
}

class Student{
    //非泛型类中定义了泛型方法
    //声明时机：参数传递时确定类型
    //所以这种单独泛型方法必须要有参数才有意义
    <T> void test(T a){
        System.out.println(a);
    }

    //静态方法也能自定义泛型
    //<>标识符必须卸载static和返回值修饰符中间
    //<E> static void test2(E name){
    static <E> E test2(E name){
        System.out.println(name.getClass());
        return name;
    }

}

public class GenericTypeDemo {
    public static void main(String[] args) {
      //创建对象时指明类型
        Point<String> p1=new Point<>(1,"String");
        new Student().test(p1);
        new Student().test2(p1);
    }
}
