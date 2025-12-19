package gui2;

import gui.LoginFrame;

public class test3 {
    //目标：自定义登陆界面，让界面对象本身也是事件监听器对象
    public static void main(String[] args) {
        LoginFrame  lf = new LoginFrame();//登陆界面
        lf.setVisible(true);//显示界面
    }
}
