package 面对对象.集合;

import java.rmi.StubNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTask1 {
    public static void main(String[] args){
        List<StudentTask1> list=List.of(
                new StudentTask1("zhou",99),
                new StudentTask1("xuan",60),
                new StudentTask1("haha",88));
        var stus=new Students(list);
        stus.FindMapTask("hhhh");
        stus.FindMapTask("zhou");
        stus.FindMapTask("xuan");
        for(StudentTask1 stu:list){
            System.out.println(stu.toString());
        }
        System.out.println(stus.FindList("xuan"));
        System.out.println(stus.FindList("hhhh"));
        System.out.println(stus.FindList("zhou"));
        System.out.println(stus.cache.entrySet());
        
    }
    
}

class Students{
    List<StudentTask1> list;
    Map<String, Integer> cache;

    Students(List<StudentTask1> list){
        this.list=list;
        cache= new HashMap<>();
    }
    Integer FindMapTask(String name){
        if(cache.get(name)!=null){
            return cache.get(name);
        }else{
            if(FindList(name)!=-1){
                cache.put(name,FindList(name));
                return FindList(name);
            }
            return -1;
        }
        /*//先遍历map如果没有则直接加进去
        for(String key:cache.keySet()){
            if(key.equals(name)){
                return cache.get(key);
            }
            else{
                if(FindList(name)!=null){
                    cache.put(name,FindList(name));
                    return FindList(name);
                }
            }
            return -1;
        }*/
    }
    Integer FindList(String name){
        for(StudentTask1 stu:list){
            if(stu.name.equals(name)){
                return stu.score;
            }
        }
        return -1;
    }
}

class StudentTask1{
    public String name;
    public int score;

    @Override
    public String toString() {
        return "StudentTask1{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    StudentTask1(String name, int score){
        this.name=name;
        this.score=score;
    }
}
