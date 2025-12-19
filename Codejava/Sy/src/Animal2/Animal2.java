package Animal2;

class Animal2 {
    String color;
    int age;
    public Animal2(String color, int age) {
        this.color = color;
        this.age = age;
    }
}
interface Action{
    void eat();
}
class Dog extends Animal2 implements Action{
    public Dog(String name, int age) {
        super(name, age);
    }
    public void eat(){
        System.out.println("狗吃骨头");
    }
}
class Cat extends Animal2 implements Action{
    public Cat(String name, int age) {
        super(name, age);
    }
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
