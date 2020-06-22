package 面对对象.常用类;

/**
 *  exit
 *  终止当前正在进行的虚拟机
 *
 *  gc()
 *  马上运行垃圾回收器
 */
class  Task{
    private int time;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
public class Systemexit {
    //垃圾回收时立即调用的方法
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("sys");
    }

    public static void main(String[] args) {
        //System.exit(0);
        System.out.println("end");
        new Task();

        // 运行垃圾回收（）
        System.gc();
    }
}
