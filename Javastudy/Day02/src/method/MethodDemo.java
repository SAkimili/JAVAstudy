package method;

public class MethodDemo {
    public static void main(String[] args) {
    }  //认识方法重载
       //定义一个重载方法
        public static void method(int a,int b){
            System.out.println("重载方法1");
        }
        public static void method(int a,int b,int c){
            System.out.println("重载方法2");
        }
        //注意：方法重载只关心方法名称相同，形参列表不同（类型不同，个数不同,顺序不同），其他都无所谓



}
