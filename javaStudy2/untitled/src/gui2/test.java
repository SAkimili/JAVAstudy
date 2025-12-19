package gui2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class test {
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
        //给按钮绑定点击事件监听器对象
     jb.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             JOptionPane.showMessageDialog(jf,"登录成功");
             //一旦你点击jb按钮，底层出发这个方法执行
             //e  是事件对象，封装了事件相关信息

         }
     });
     //需求：监听用户键盘上下左右四个按键的事件
        //给jf窗口绑定按键事件
        jf.addKeyListener(new KeyAdapter() {
             @Override
             public void keyPressed(KeyEvent e) {
                 System.out.println("用户按下了键盘");
                 //e是事件对象，封装了事件相关信息
                 //获取键盘按键的ASCII码值
                 int keyCode = e.getKeyCode();//那事件源头的键帽编号
                 //判断用户按下了哪个键
                 switch (keyCode){
                     case KeyEvent.VK_UP:
                         System.out.println("用户按下了上");
                         break;
                     case KeyEvent.VK_DOWN:
                         System.out.println("用户按下了下");
                         break;
                         case KeyEvent.VK_LEFT:
                             System.out.println("用户按下了左");
                             break;
                             case KeyEvent.VK_RIGHT:
                                 System.out.println("用户按下了右");
                                 break;
                 }
             }
        });
        jf.setVisible(true);//设置窗口可见
        jf.requestFocus();//让窗口成为焦点
    }
}
