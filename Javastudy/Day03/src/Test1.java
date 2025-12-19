import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        //1. 键盘录入两个数字，键盘录入一个运算符，根据运算符进行运算。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字 ");
        int num1 = sc.nextInt();
        System.out.println("请输入一个数字 ");
        int num2 = sc.nextInt();
        System.out.println("请输入运算符（+，-，*，/）");
        String operator = sc.next();//"*"
        double result =calc(num1,num2,operator);
        System.out.println("计算的结果为："+result);



    }
    public static double  calc(double num1,double num2,String operator){
       //2.把这个数据交给方法，根据运算符进行运算，帮我计算结果并返回给我
      double result=0;//定义一个double类型的变量基本本次运算的结果，方便返回
        switch (operator){
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                if(num2==0){
                    System.out.println("被除数不能为0");
                }
                break;
            default:
                System.out.println("运算符输入错误");
       }
       return result;
    }

}
