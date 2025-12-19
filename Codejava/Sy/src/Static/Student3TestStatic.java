package Static;
public class Student3TestStatic {
        public static void main(String[]args) {
            Student3.School="清华大学";
            Student3 stu1=new Student3("小明",18);
            Student3 stu2=new Student3("小红",20);
            Student3.show();
            System.out.println("在校学生"+stu1.name);
            System.out.println("在校学生:"+stu2.name);
        }
    }
