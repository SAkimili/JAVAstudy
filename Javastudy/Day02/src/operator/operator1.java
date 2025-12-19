package operator;

public class operator1 {
    public static void main(String[] args){
        //掌握自增自减运算符
        print();
        System.out.println("***********");
        print2();
    }
    public static void print(){
        int a = 10;
        int b = 20;
        System.out.println(a++);//先输出a再自增 a=a+1
        System.out.println(++b);//先自增再输出b
        System.out.println(a);
        System.out.println(b);
    }
    //设计一个方法，理解自增和自减放在变量前后的区别
    public static void print2(){
        int a = 10;
        int b = 20;
        System.out.println(++a);//a=11
        System.out.println(a++);//a=11
        System.out.println(a);//a=12
        System.out.println(b++);//20
        System.out.println(++b);//22
        System.out.println(b);//22
    }
}
