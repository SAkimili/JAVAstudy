package TyPe.Type;

public class Demo {
    public static void main(String[] args){
        //目标：理解表达式的自动类型提升
        method(1,2.0,'a');
    }
    //需求：接受各种类型的数据运算

    public static  void method(int a,double b,char c){
        System.out.println(a+b+c);
    }
    public static  double method1(int a,double b,char c){
        System.out.println(a+b+c);
        return a+b+c;
    }
    //强制转换
    public static  byte method2(byte a,byte b){
        byte c=(byte)(a+b);
        return c;
        //return (byte)a+b;
    }
}
