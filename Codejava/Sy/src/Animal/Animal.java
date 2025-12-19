package Animal;

public class Animal {
    String color;//颜色
    int age;//年龄
    public void eat(){
        System.out.println("我在吃食中...");
    }
    public void drink(){
        System.out.println("我在喝水中...");
    }
}
class Fish extends Animal{
    public void printInfo() {
        System.out.println("这是:"+color+"颜色的🐟");
        System.out.println("今年"+age+"岁了！");
    }
    public void eat(){
        System.out.println("🐟在吃水中的食物...");
    }


}
