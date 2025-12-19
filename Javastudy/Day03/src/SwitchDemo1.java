public class SwitchDemo1 {
    public static void main(String[] args){
        //目标：搞清楚switch的注意事项，穿透性的应用
        test3();
    }
    /*1.表达式类型只能是字符串、字符、整型、枚举类型（byte,short,int,char）,
    JDK5开始支持枚举,JDK7开始支持字符串类型，不支持double*/
    public static void test1(){
        int i = 10;
        switch (i){
            case 10:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            default:
                System.out.println("星期四");
        }
    }
    //2.switch表达式只能是常量(字面量)，不能是变量，case给出的值也必须是常量，不允许重复
    public static void test2(){
        int a=10;
        int b;
        switch (a){
            case 10:
                System.out.println("星期一");
                break;
            case 8:
                System.out.println("星期二");
                break;
            case 7:
                System.out.println("星期三");
                break;
            default:
                System.out.println("星期四");
        }
    }
    //3.正常使用switch的时候，不要忘记写break,否则会穿透到下一个case
    //穿透性作用：相同程序的case块，可以通过穿透性进行合并，从而减少重复代码的书写。
    public static  void test3(){
        String week = "星期一";
        switch (week){
            case "星期一":
                System.out.println("星期一");
            case "星期二":
                System.out.println("星期二");
                //break;
            case "星期三":
                System.out.println("星期三");
                break;
            default:
                System.out.println("星期四");
        }
    }
}
