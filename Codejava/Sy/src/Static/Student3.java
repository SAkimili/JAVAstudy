package Static;

public class Student3 {
    String name;
    int age;
    static String School;
    Student3() {

    }

    Student3(String name, int age) {
        this.name = name;
        this.age = age;
    }
  public static void show(){
        System.out.println("学校的名称为："+School);
  }
}
