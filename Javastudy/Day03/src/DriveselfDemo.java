import java.util.Scanner;

public class DriveselfDemo {
    public static void main(String[] args){
        System.out.println("请输入灯的颜色：");
        Scanner scanner = new Scanner(System.in);
        String light = scanner.next();
        drive(light);

    }
    public static void  drive(String light){
        switch (light){
            case "red":
                System.out.println("停止");
                break;
            case "yellow":
                System.out.println("减速");
                break;
                case "green":
                    System.out.println("加速");
                    break;
                default:
                    System.out.println("直行");
        }
    }
}
