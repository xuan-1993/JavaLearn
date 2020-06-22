/**
 * 编写JUnit测试
 *
 * 编写接口-》编写测试-》编写实现-》运行测试-》任务完成
 */

package 面对对象.单元测试;

public class Demo1 {
    private long n = 0;

    public long add(long x) {
        n = n + x;
        return n;
    }

    public long sub(long x) {
        n = n - x;
        return n;
    }
    public static void main(String[] args) {

    }
}
