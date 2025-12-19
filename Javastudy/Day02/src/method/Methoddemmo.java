package method;

public class Methoddemmo {
    public static void main(String[] args) {
       //在无返回值的方法中单独使用return；提前结束方法
     div(10,10);

    }
    //设计一个除法的功能
    public static void div(int a,int b){
        if(b==0){
            System.out.println("除数不能为0");
            return;//提前结束方法,卫语言风格
        }
        System.out.println(a/b);
    }

}
