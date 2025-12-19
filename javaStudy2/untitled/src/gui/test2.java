package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test2 {
    public static void main(String[] args) {
        //第一种写法，提供实现类：创建实现类对象代表事件监听器对象
        JFrame jf = new JFrame("登录界面");
        JPanel  panel = new JPanel();//创建一个面板
        jf.add(panel);//将面板添加到窗口中

        jf.setSize(400,300);//设置窗口大小
        jf.setLocationRelativeTo(null);//设置窗口居中
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭模式：关闭窗口后程序结束
        JButton jb= new JButton("登录");//创建一个按钮
        panel.add(jb);//将按钮添加到面板中
        jf.setVisible(true);//设置窗口可见
        jb.addActionListener(new MyActionListener(jf));
    }
}
//实现类：
class MyActionListener implements ActionListener {
    private JFrame jf;
    public MyActionListener(JFrame jf) {
      this. jf =  jf;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(jf,"登录成功");
        System.out.println("点击了登录按钮");
    }
}
