package 面对对象.集合;

import java.util.HashMap;
import java.util.Map;

/**
 * 键值对
 */
public class MapDemo {
    public static void main(String[] args) {
        //创建一个对象
        StudentMapDemo ming=new StudentMapDemo("xiaoming",99);

        StudentMapDemo zhang=new StudentMapDemo("xiaohong",99);
        //创建一个键值对数据结构
        Map<String,StudentMapDemo> map=new HashMap<>();

        //将元素添加进这个键值对
        map.put("xiaoming",ming);

        //添加第二个元素
        map.put("xiaohong",zhang);

        //根据xiaoming搜索对象实例
        System.out.println(map.entrySet());
        
        //返回此映射中的键的视图
        System.out.println(map.keySet());


        //返回此映射中的值，所有的值
        System.out.println(map.values());
        
        //搜索一个不存在的key,返回的是null
        System.out.println(map.get("huas"));

        //再创建一个键值对
        Map<String, Integer> map1=new HashMap<>();
        map1.put("apple",1);
        map1.put("pear",3);
        map1.put("apple",2);
        System.out.println(map1.get("apple"));
        
        
        //遍历一个map
        for(String name:map.keySet()){
            System.out.println(map.get(name).score);
        }


    }
}

class StudentMapDemo{
    public String name;
    public int score;
    public StudentMapDemo(String name,int score){
        this.name=name;
        this.score=score;
    }

    @Override
    public String toString() {
        return "StudentMapDemo{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
