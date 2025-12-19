public class LoopDemo1 {
    public static  void main(String[] args){
        sum();


    }
    public static int sum(){
        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                sum += i;

            }
        }
        System.out.println(sum);
        return sum;
    }
}
