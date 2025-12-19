import java.util.Random;
import java.util.Scanner;

public class guessmath {
    public static void main(String[ ]args){
        guess();

    }
    public static void guess(){
        //1.生成随机数：1-100之间
        //Math.random()返回0-1之间的随机数
        // *100+1，再强制转换成int类型
        //Math.random()*100+1==>[0,100)的整数[0,99]+1==
        //方式一：int num=(int)(Math.random()*100)+1;
        //方式二：
        Random r=new Random();//得到一个随机数对象
   int luckNumber=r.nextInt(100    )+1;//[0,99]+1==>[1,100]
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("欢迎来到猜数游戏，请输入一个数字：");
            int guessNumber=scanner.nextInt();
            if(guessNumber>luckNumber){
                System.out.println("猜大了");
            }else if(guessNumber<luckNumber){
                System.out.println("猜小了");
            }else{
                System.out.println("恭喜你猜对了");
                break;
            }
        }
    }
}
