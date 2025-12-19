public class ForForDemo {
    public static void main(String[] args){
     starprint();
     starprint2();
     starprint3();
    }
    public static void starprint(){
        //打印行
        for(int i=1;i<=6;i++){
            //打印列
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void starprint2(){
        //打印行
        for(int i=1;i<=6;i++){
            //打印列
            for(int j=1;j<=6;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void starprint3(){
        //打印行
        for(int i=6;i>=1;i--){
            //打印列
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
