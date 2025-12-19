
    class Person {
        String name;

        public void work() {
            System.out.println("Person is working");
        }
    }

    class Student extends Person {
        public void work() {
            System.out.println("Student is working");
        }
    }

    public void show() {
        String name = "";
        System.out.println("我的名字：" + name);
    }

    class Teacher extends Person {
        public void work() {
            System.out.println("Teacher is working");
        }
    }

    public void main() {
    }

