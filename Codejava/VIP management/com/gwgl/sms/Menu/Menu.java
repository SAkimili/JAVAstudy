package com.gwgl.sms.Menu;
import com.gwgl.sms.data.Customer;
import com.gwgl.sms.managent.CustManager;

import java.util.Scanner;

public class Menu {

    public void showMenu() {

        boolean con=true;
        CustManager custManager = new CustManager();
        do {
            System.out.println("\n\t购物管理系统>客户信息管理");
            System.out.println("**************************************************\n");
            System.out.println("\t\t1.显示所有客户信息\n");
            System.out.println("\t\t2.添加客户信息\n");
            System.out.println("\t\t3.修改客户信息\n");
            System.out.println("\t\t4.删除客户信息\n");
            System.out.println("**************************************************");
            System.out.println("请选择，输入数字或按0返回上一级菜单");
            Scanner input=new Scanner(System.in);
            int no = input.nextInt();
            if (no == 1) {
                //执行显示所有客户信息
                System.out.println("购物管理系统>会员信息管理>显示会员信息\n");
                custManager.showCustomers();
            }
            else if (no == 2) {
                //执行添加客户信息
                String answer = "y";
                System.out.println("购物管理系统>会员信息管理>添加会员信息\n");
                while (answer.equals("y")) {
                    Customer cust = new Customer();
                    System.out.println("请输入会员编号：（<四位整数>）");
                    int inputNO = input.nextInt();
                    if (inputNO < 1000 || inputNO > 9999) {
                        System.out.println("录入失败！会员号：" + input + ",是无效编号，会员号必须是1000-9999的整数！");
                        continue;
                    } else {
                        cust.custNO = inputNO;
                    }
                    System.out.println("请输入会员生日（月/日<用两位数表示>）：");
                    cust.custBirthday = input.next();
                    System.out.println("请输入会员积分：");
                    cust.custscore = input.nextInt();
                    custManager.add(cust);
                    System.out.println("是否继续添加会员信息（y/n）");
                    answer = input.next();
                }
            }
            else if (no == 3) {
                System.out.println("购物管理系统>会员信息管理>修改会员信息\n");
                System.out.println("请输入会员编号：（<四位整数>）");
                int inputNO = input.nextInt();
                System.out.println("请输入会员生日（月/日<用两位数表示>）：");
                String custBirthday = input.next();
                System.out.println("请输入会员积分：");
                int custscore = input.nextInt();
                custManager.edit(inputNO,custBirthday,custscore);

            } else if (no==4) {
                System.out.println("购物管理系统>会员信息管理>查询会员积分\n");
                System.out.print("请输入想要查找的会员编号：（<四位整数>）");
                int inputNO = input.nextInt();
                if (custManager.searchSocre(custNo) != -1) {
                    System.out.println("该会员积分为：" + custManager.searchSocre(custNo));
                } else {
                    System.out.println("该会员不存在！");
                }
            } else if (no == 0) {
                System.out.println("输入错误，请重新输入数字：");
             }


            }while (con);
        }
        }
