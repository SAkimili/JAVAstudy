package BMI;

import java.util.Scanner;

public class BMI{


    public static void main(String[] args) {
        double [] inputs = userInput();
        System.out.println("您的BMI指数为："+BMI(inputs[0], inputs[1]));
        //  传递参数：inputs[0]是weight，inputs[1]是height
    }
    public static double [] userInput() {
        Scanner scanner = new Scanner(System.in);//创建一个扫描器
        System.out.println("请输入体重（单位：千克)");
        double weight = scanner.nextDouble();
        System.out.println("请输入身高（单位：米）");
        double height = scanner.nextDouble();
        System.out.println("请输入性别");
        String sex = scanner.next();
        System.out.println("请输入年龄");
        int age = scanner.nextInt();
        return new double[]{weight, height};
    }
    public static double BMI(double weight, double height) {
        double BMI = weight / (height * height);

        if (BMI < 18.5) {
            System.out.println("体重过轻");
        } else if (BMI >= 18.5 && BMI< 24.9) {
            System.out.println("正常");
        } else if (BMI >= 24.9 && BMI< 29.9) {
            System.out.println("体重过重");
        } else if (BMI >= 29.9 && BMI < 34.9) {
            System.out.println("肥胖");
        }
        return BMI;
    }
}
