package 面对对象.多态类;

/**
 * 多态的作用：
 */
class Animal{
    void eat(){
        System.out.println("动物吃饭了");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("狗吃骨头");
    }
    void doWork(){
        System.out.println("wangwangwang");
    }

}

class Fish extends Animal{
    void eat(){
        System.out.println("猫吃鱼");
    }
    void watch(){
        System.out.println("抓老鼠 ");
    }
}


class Person{
    void feedAnimal(Animal animal){
        animal.eat();
        if(animal instanceof Dog){
            ((Dog) animal).doWork();
        }
        if(animal instanceof Fish){
            ((Fish) animal).watch();
        }
    }
}
public class TestDT {
    public static void main(String[] args) {
        Animal dog= new Dog();
        Animal fish= new Fish();

        Person person=new Person();
        person.feedAnimal(dog);
        person.feedAnimal(fish);
    }

}
