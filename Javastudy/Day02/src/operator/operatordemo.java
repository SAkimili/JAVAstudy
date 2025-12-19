package operator;

public class operatordemo {
    public static void main(String[] args) {
        relation();

    }

    //收红包
    public static void receiveRedPacket(int money) {
      //拿到自己钱包的金额
        int wallet = 100;
        wallet += money;//等价于wallet = (wallet的类型)(wallet + money);
        System.out.println("钱包金额：" + wallet);
        byte b = 12;
        byte c = 13;
        b+=c;//b = (byte)(b + c);
        System.out.println(b);

    }
    //理解关系运算符
    public static void relation() {
        int a = 10;
        int b = 20;
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);
    }
}