package Person1;

class Person {
    String name;
    public void work() {
        System.out.println("他在工作！");
    }
}

class Teacher extends Person {
    public void work() {
        System.out.println("老师在教课！");
    }
}
