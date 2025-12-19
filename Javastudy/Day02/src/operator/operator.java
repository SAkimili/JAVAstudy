package operator;

public class operator {
    public static void main(String[] args) {
        print(10, 20);
        print2();
    }
    //目标：搞清楚最基本的算术运算符
    public static void print(int a, int b) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);//表达式的最终类型由表达式的最高类型决定的
        System.out.println(a % b);
        System.out.println((double) a / b);//强制类型转换
        System.out.println(1.0*a / b);//强制类型转换
    }
    public static void print2(){
        int a=5;
        System.out.println("abc"+a);//abc5
        System.out.println(a+5);//10
        System.out.println("Saki"+a+"a");//Saki5a
        System.out.println(a+'a'+"Saki");//102Saki
    }
}
