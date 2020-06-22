package 面对对象.枚举;

/**
 * 使用枚举
 * 枚举是一个特殊的类，那是否能创建对象？ 不能直接创建对象，使用类调用
 */

enum Sex{
    MAN,FEMALE    
}

public class UseEnum {
    public static void main(String[] args) {
        System.out.println(Sex.FEMALE);

        System.out.println(Sex.FEMALE.ordinal());
        Sex[] allres=Sex.values();
        for(Sex sex:allres){
            System.out.println(sex);
        }
    }
}
