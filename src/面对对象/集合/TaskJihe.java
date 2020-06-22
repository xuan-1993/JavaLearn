package 面对对象.集合;

import java.util.HashMap;
import java.util.Map;

public class TaskJihe {

    //aabbbCCC每个字符出现的次数
    //1.字符串转成数组
    //2.取出每一个字符
    //3.统计出现的次数(怎么统计)maap
    public static void main(String[] args) {
        String s="aabbbCCC";
        char[] ch=s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(char c:ch){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
