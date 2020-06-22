package 面对对象.集合;

import java.util.HashMap;

/**
 * hashmap线程不安全，效率高
 * hashTable线程安全，效率低
 * HashMap是可以存储null
 * HashTable 是不能存储null
 *
 */
public class HashTable {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(null,1);
        hm.put(2,null);


        HashTable ht=new HashTable();
    }
}
