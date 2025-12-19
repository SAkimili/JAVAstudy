package encapsulation;
public class student {
    private String name;
    private int age;

    private String getName() {
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age<0){
            this.age=0;
        }else {
            this.age=age;
        }
    }
    public  void show(){
        System.out.println("姓名："+name+"年龄："+age);
    }
}
