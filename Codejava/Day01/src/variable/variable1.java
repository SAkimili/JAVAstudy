package variable;

public class variable1 {
    public static void main(String[] args) {

        printVariable();
    }
    public static void printVariable(){
        //1.整型（默认整数类型是int,希望23456789是long类型，需要显示的指定，加上L或l）
        byte b = 10;
        short s = 20;
        int i = 30;
        long l=40;
        long l1 = 234567890L;
        //2.浮点型（默认浮点类型是double，希望1.1是float类型的，必须加上f或F）
        float f = 50.0f;
        double d = 60.0;
        //3.字符型
        char c = 'a';
        char c1 = '中';
        //4.布尔型
        boolean b1 = true;
        //5.字符串型（引用数据类型）：定义字符型变量记住字符串数据的
        String str = "hello world";
        System.out.println(str);
    }






}
