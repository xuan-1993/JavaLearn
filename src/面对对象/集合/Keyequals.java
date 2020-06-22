package 面对对象.集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Keyequals {
    public static void main(String[] args) {
        Map<KeyTask, Integer> map = new HashMap<>();
        var key1=new KeyTask(1,2);
        var key2=new KeyTask(1,2);
        map.put(key1, 123);
        System.out.println(key1 == key2);
        System.out.println(key1.equals(key2));
    }
}

class KeyTask{
    private int a;
    private int b;
    KeyTask(int a,int b){
        this.a=a;
        this.b=b;
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyTask keyTask = (KeyTask) o;
        return a == keyTask.a &&
                b == keyTask.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
