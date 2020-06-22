package 面对对象.集合;

/**
 * 集合
 * 起源于
 * 数组：弊端太明显，长度固定，不能再添加元素
 *
 * 集合类：
 *      它的长度是可以改变
 *      能存储任意的对象
 *      长度是随着你的元素的增加而增加
 *
 * 数组和集合区别？
 * 1.素组能存放基本数据类型，和引用类型
 * 2.集合只能存放引用数据类型，直接放基本数据类型也会帮你装箱
 *  集合只能存放对象
 * 3.数组的长度是固定的，不能再增加
 *  集合长度可以改变，根据元素的增加而增加
 *
 * 什么时候使用数组什么时候使用元素
 * 1、如果元素葛素固定，推荐使用数组（容易浪费空间）
 * 2. 如果元素不是固定，推荐使用集合
 *
 *
 * 集合分类：
 * 父类接口（Collection 接口）
 * 1.List接口 有序（实现类： ArrayList  linkedLIst Vector）
 * 2.Set几口 无序(实现类： HashSet TreeSet)
 *
 *
 * ArrayList 数组实现
 * LinkedList 链表实现
 * Vector 数组实现
 *
 * HashSet 哈希算法
 * TreeSet 二叉树方法
 *
 */

public class CollectionDemo {
    public static void main(String[] args) {
        int[] i1={1,2,3,4,5};
        i1[5]=6;
    }

}
