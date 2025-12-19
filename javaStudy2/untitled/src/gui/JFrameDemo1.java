package gui;

import javax.swing.*;

public class JFrameDemo1 {
    public static void main(String[] args) {
        //目标：快速入门GUI Swing的编程
        //1.创建一个窗口，有一个登陆按钮
        JFrame jf = new JFrame("登录界面");
        JPanel  panel = new JPanel();//创建一个面板
        jf.add(panel);//将面板添加到窗口中

        jf.setSize(400,300);//设置窗口大小
        jf.setLocationRelativeTo(null);//设置窗口居中
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭模式：关闭窗口后程序结束
        JButton jb= new JButton("登录");//创建一个按钮
        panel.add(jb);//将按钮添加到面板中
        jf.setVisible(true);//设置窗口可见
    }
}
