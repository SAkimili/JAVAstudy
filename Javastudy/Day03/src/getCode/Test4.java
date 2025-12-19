package getCode;

public class Test4 {
    public static void main(String[] args) {
        //目标：查找101-200之间的素数
        //1.遍历101-200的每一个数
        int count=0;
        for (int i = 101; i < 201; i++) {
          if (isPrime(i)){
              System.out.println(i);
              count++;
          }

        }
        System.out.println("素数的个数为："+count);
    }
        //2.判断当前数是否是素数（独立功能独立方法）
    public static boolean isPrime(int num){
        //num=101
        //定义一个循环从2开始找从2到num/2的数，如果能整除，则不是素数，返回false
        for (int i = 2; i <=num/2; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
        //3.如果是素数，打印出来

}
