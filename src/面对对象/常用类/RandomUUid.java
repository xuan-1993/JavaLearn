package 面对对象.常用类;

import java.util.Random;
import java.util.UUID;

public class RandomUUid {
    public static void main(String[] args) {
        Random r=new Random();

        //返回下一个伪随机数，它是此随机数生成器的序列中均匀分布的 int 值。
        int res=r.nextInt();

        //生成[0,9)
        int res1=r.nextInt(10);

        //相同的种子，生成的随机速也一样
        Random r2=new Random(110);
        System.out.println(res);
        System.out.println(res1);

        //生成[34-134]
        //34+r.next(100)+r.next(1)
        
        //UUID:通用标识符
        //在一台机子上生成一个数字，每次会变

        //当前时间跟电脑网卡 生成的一段字符，唯一的
        String uuid= UUID.randomUUID().toString();
        System.out.println(uuid);
    }
}
