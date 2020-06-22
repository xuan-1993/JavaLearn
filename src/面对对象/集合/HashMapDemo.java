package 面对对象.集合;

import java.awt.desktop.SystemSleepEvent;
import java.sql.PseudoColumnUsage;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        //entry 键值对
        Map<MapTask, String> map = new HashMap();
        map.put(new MapTask(10, "zhou"), "哈哈");
        map.put(new MapTask(11, "xuan"), "哈哈1");
        map.put(new MapTask(11, "xuan"), "哈哈2");

        //Entry定义在Map内部的一个接口
        //获取所有entry对象返回一个Set,可以通过遍历的方法去除所有的对象
        Set<Map.Entry<MapTask,String>> entrySet=map.entrySet();
        Iterator<Map.Entry<MapTask, String>> it1= entrySet.iterator();
        while(it1.hasNext()){
            Map.Entry<MapTask, String> next = it1.next();
            System.out.println(next.getKey());
            System.out.println(next.getValue());
        }


        System.out.println("------------------");
        //没有迭代器，不能用it.next,可以把keySet拿出来用迭代器
        Set<MapTask> set = map.keySet();
        Iterator<MapTask> it = set.iterator();
        while (it.hasNext()) {
            MapTask m = it.next();
            String s = map.get(m);
            System.out.println(m + "=" + s);
        }


        System.out.println("------------");
        for (MapTask t : map.keySet()) {
            //System.out.println(t.getClass());
            System.out.println(t + "=" + map.get(t));
        }
        /*System.out.println(map.get("a")); //entry empty is {}
        //修改
        map.put("a",4);
        System.out.println(map.get("a"));*/

    }
}

class MapTask {
    private int age;
    private String name;

    public MapTask(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MapTask mapTask = (MapTask) o;
        return age == mapTask.age &&
                Objects.equals(name, mapTask.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "MapTask{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}