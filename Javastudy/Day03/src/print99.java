public class print99 {
    public static void main(String[] args){
        print99();
    }
    public static void print99(){
        //1.定义一个循环打印多少行
        for(int i=1;i<=9;i++){
            //2.定义一个循环打印多少列
            for (int j = 1; j <=i; j++) {
                System.out.print(j+"*"+i+"="+j*i+"\t");

            }
        //3.换行
            System.out.println();
        }
    }
}
