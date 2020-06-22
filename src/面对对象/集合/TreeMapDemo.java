package 面对对象.集合;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * TreeMap是接口sortedMap的实现
 * 会对key进行排序
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        //使用键的自然顺序构造一个新的、空的树映射
        /*Map<TreeMapTask,Integer> map= new TreeMap<>();
        //自定义类型的key 并没有实现compare,需要实现comparable接口
        map.put(new TreeMapTask(1,2),1);
        map.put(new TreeMapTask(2,3),4);
        map.put(new TreeMapTask(6,4),1);
        map.put(new TreeMapTask(3,4),6);
        System.out.println(map.keySet());
        System.out.println(map.entrySet());*/
        Map<TreeMapTask1,Integer> map1=new TreeMap<>(new Comparator<TreeMapTask1>(){
            public int compare(TreeMapTask1 p1,TreeMapTask1 p2){
                if (p1.score == p2.score) {
                    return 0;
                }
                return p1.score>p2.score ? 1:-1;
            }
        });



        map1.put(new TreeMapTask1("xuan",1),1);
        map1.put(new TreeMapTask1("xuan1",3),1);
        map1.put(new TreeMapTask1("xuan2",2),1);
        System.out.println(map1.keySet());
        System.out.println(map1.entrySet());




    }
}
class TreeMapTask implements Comparable{
    public int a;
    public int score;
    TreeMapTask(int a,int b){
        this.a=a;
        this.score =b;
    }


    @Override
    public int compareTo(Object o) {
         if(o instanceof TreeMapTask){
             TreeMapTask p=(TreeMapTask) o;
             if(this.score>p.score){
                 return 1;
             }
             return -1;
         }
         return -1;
    }

    @Override
    public String toString() {
        return "TreeMapTask{" +
                "a=" + a +
                ", b=" + score +
                '}';
    }
}

class TreeMapTask1{
    String name;
    int score;
    public TreeMapTask1(String name,int score){
        this.name=name;
        this.score=score;
    }

    @Override
    public String toString() {
        return "TreeMapTask1{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}