package method;

import java.util.function.DoubleToIntFunction;

public class method {

    public static void main(String[] args) {
      int sum = getSum(20,20);
      System.out.println(sum);
      printHelloWorld();
     System.out.println("***********");
     System.out.println(getVerifyCode(4));
    }

    //定义一个方法，求任意两个整数的和并返回
    public static int getSum(int a,int b){
        int sum = a+b;
        return sum;
    }
    //打印三行Hello World，不需要参数无返回值
    //注意：如果方法没有返回结果，返回值类型必须声明为void
    //无参数，无返回值
    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    //获取一个指定位数的验证码返回
    //需要接收数据（参数），接受位数，int len
    //需要返回数据，返回验证码，String
    //有参数，有返回值
    public static String getVerifyCode(int len){
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String code = "";
        for (int i = 0; i < len; i++) {
            int index = (int)(Math.random()*str.length());
            code += str.charAt(index);
        }
        return code;
    }




}
