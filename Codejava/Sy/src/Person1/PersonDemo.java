package Person1;

public class PersonDemo {
    public static void personWork(Person p) {
        p.work();
    }

    public static void main(String[] args) {
        Person p1 = new Student();
        personWork(p1);
        Person p2 = new Teacher();
        personWork(p2);

    }
}
