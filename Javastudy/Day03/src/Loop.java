public class Loop {
    public static void main(String[] args) {
        sum();
    }
    public static int sum() {
        int Sum=0;
        for (int i=1;i<5;i++){
            Sum=Sum+i;
            System.out.println(Sum);
        }System.out.println(Sum);
        return Sum;
    }

}
