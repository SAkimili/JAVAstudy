package getCode;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(getCode(4));
        System.out.println(getCode(6));

    }//1.调用一个方法返回执行位数的验证码 ，每位只能是数字或者大写字母或者小写字母
    public static  String getCode(int n){//n:记录位数
        //2.定义一个字符串变量用于记录验证码
        String code="";
        //3.循环n次，每次循环生成一个验证码
        for (int i = 0; i < n; i++) {
            //4.为当前位置随机生成一个数字或大写字母或小写字母
                int tpye = (int)(Math.random()*3);
                //(int)(Math.random()*3)表示[0，3）,0,1,2
            // 0:数字 1:大写字母 2:小写字母
            //5.根据type的值生成数字或字母,使用switch判断当前位置随机的字符类型
            switch (tpye) {
            case 0:
                //生成数字
                int num0=(int)(Math.random()*10);//随机生成0-9的数字
                code+=num0;//拼接
                break;
            case 1:
                //生成大写字母，随机生成0-25的数字，然后加上'A'，得到A-Z的ASCII码对应的字符
                int num1=(int)(Math.random()*26);
                char ch=(char)('A'+num1);//A=65,Z=90
                code+=ch;
                break;
            case 2:
                //生成小写字母,随机生成0-25的数字，然后加上'a'，得到a-z的ASCII码对应的字符
                int num2=(int)(Math.random()*26);
                char ch1=(char)('a'+num2);//a=97,z=122
               code+=ch1;
            }

        }
        return code;

}
}
