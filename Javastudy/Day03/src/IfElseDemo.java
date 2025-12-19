import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args){
        PerformanceForm();
    }
    public static void PerformanceForm(){
        //考核表，给员工打分
        //A+ 100-90 A 80-90 B 60-80 C 60-40 D 40-0
        System.out.println("请输入分数：");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(score>=90&&score<=100){
            System.out.println("A+");
        } else if (score<90&&score>=80) {
            System.out.println("A");
        } else if(score<80||score>=60){
            System.out.println("B");
        }else if (score<60||score>=40) {
            System.out.println("C");
        } else if (score<40||score>=0) {
            System.out.println("D");
        }else {
            System.out.println("输入有误");
        }
    }
}
