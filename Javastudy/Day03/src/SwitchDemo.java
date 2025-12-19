import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("请输入性别：");
        Scanner scanner = new Scanner(System.in);
        String gender = scanner.next();
        recommendBook(gender);
    }
    //根据性别推荐不同的书
    public static void recommendBook(String gender) {
        switch (gender) {
            case "男":
                System.out.println("推荐《豌豆笑传之踩踩背》");
                break;
            case "女":
                System.out.println("推荐《紫色心情的正确使用方法》");
                break;
            default:
                System.out.println("推荐《物种百科之哈吉美（道莉，肥莉）》");
        }
    }


}
