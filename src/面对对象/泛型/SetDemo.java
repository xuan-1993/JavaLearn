package 面对对象.泛型;

import java.util.Comparator;

/**
 * Set中存放的元素都是无序的
 */
public class SetDemo {
    public static void main(String[] args) {

    }
}

class Demo1 implements Comparator<String>{


    @Override
    public int compare(String o1, String o2) {
        return 0;
    }
}