package literal;

/**
 * 掌握常见字面量的书写格式
 */
public class literalDemo {
    public static void main(String[] args) {
       printliteral();
    }
    public static void printliteral(){
        //帮我直接输出5个常见的字面量
        System.out.println("hello world");
        System.out.println(true);//布尔字面量，直接写，只有true和false
        System.out.println(false);//布尔字面量，直接写，只有true和false
        System.out.println(100);//整型字面量，直接写
        System.out.println(100.0);//浮点型字面量，直接写
        System.out.println('a');//字符字面量，直接写，需要用单引号，有且仅能有一个字符
        System.out.println("a");//字符串字面量，直接写，需要用双引号
        System.out.println(' ');//空格
        //特殊的字符：\n(换行功能） \t（Tab缩进功能）
        System.out.println("hello\nworld");
        System.out.println("hello\tworld");
        //字符串字面量，用双引号括起来，里面可以有任意字符
        System.out.println("sss");
        System.out.println("我是小bug");






    }
}

