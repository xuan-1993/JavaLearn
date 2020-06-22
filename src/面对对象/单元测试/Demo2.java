package 面对对象.单元测试;

public class Demo2 {
    public static long fact(long n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        long r = 1;
        for (long i = 1; i <= n; i++) {
            r = r * i;
        }
        return r;
    }
    public static void main(String[] args) {

    }


}
