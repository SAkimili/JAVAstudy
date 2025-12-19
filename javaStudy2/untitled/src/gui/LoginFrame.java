package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//自定义的登陆界面，继承父类JFrame
public class LoginFrame extends JFrame implements ActionListener {


    public LoginFrame(){
       //1.设置窗口标题
       this.setTitle("登陆界面");
       //2.设置窗口大小
       this.setSize(400,300);
       //3.设置窗口位置
       this.setLocationRelativeTo(null);
       //4.设置窗口关闭模式
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setVisible(true);
       init();//初始化这个窗口上的组件



   }
   private void init(){
       //添加一个登录按钮
       JButton btn= new JButton("登录");
       btn.addActionListener(this);//
       JPanel panel= new JPanel();
       this.add(panel);

       panel.add(btn);
   }
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this,"登录成功");
    }


}
