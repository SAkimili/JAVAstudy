package Person;

import Person1.Student;

public class Demo {
    public static void personWork(Person p){
        p.work();
        if (p instanceof Student){
            ((Student)p).show();
        }
    }
    public static void main(String[] args){
        Person p1=new Student();
        p1.name="小明";
        personWork(p1);
        Person p2=new Teacher();
        personWork(p2);
    }
}
