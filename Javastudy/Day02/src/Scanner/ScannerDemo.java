package Scanner;
import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        printerUserInfo();

    }
    //写一个程序，让用户输入年龄和姓名，然后打印出来
    public static void printerUserInfo() {
            Scanner scanner = new Scanner(System.in);//抄写这一行代码，得到Scanner扫描器对象
            System.out.println("请输入年龄：");
            //让程序在这一行暂停，等用户输入一个整数，直到按了回车键后，把年龄交给变量age记住再往下走
            int age = scanner.nextInt();
            System.out.println("请输入姓名：");
            //让程序在这一行暂停，等用户输入一个字符串名称，直到按了回车键后，把名字交给变量name记住再往下走
            String name = scanner.next();
            System.out.println("姓名：" + name);
            System.out.println("年龄：" + age);

        }
    }


