package aniMal1;

class animal1 {
    String color;
    int age;
    public animal1(String color, int age){
       this.age = age;
       this.color = color;
    }
}
class Fish extends animal1{
    public Fish (String color, int age){
        super(color,age);
    }
    public void printInfo(){
        System.out.println("这是"+color+"鱼"+"年龄是"+age);
    }
}
