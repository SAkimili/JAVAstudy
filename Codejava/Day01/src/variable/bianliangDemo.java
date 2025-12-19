package variable;

public class bianliangDemo {
    public static void main(String[] args) {
        method();
    }

    //定义一个方法，来学习变量的定义
    public static void method() {
        //定义变量：数据类型 变量名称 = 初始值;
        int a = 10;
        System.out.println(a);
        //局部变量
        int b = 20;
        System.out.println(b);
        //定义一个小数变量，存储一个学生的Java成绩
        double score = 99.5;
        System.out.println(score);
        System.out.println("----------------------");

        //为什么要用变量记住数据？ 提高数据的灵活性和维护性。
        //研究变量的特点，变量的数据是可替换的
        int age1 = 19;
        age1 = 20;
        age1=age1+1;
        System.out.println(age1);


    }
}

