public class WhileDemo {
    public static void main(String[] args){
        System.out.println("该纸张需要折叠"+mountain()+"次");
    }
    public  static int mountain(){
        double peakHeight=8848860;
        double paperThickness=0.1;
        while(paperThickness<peakHeight){
            paperThickness*=2;
        }
        return (int)paperThickness;

    }
}
