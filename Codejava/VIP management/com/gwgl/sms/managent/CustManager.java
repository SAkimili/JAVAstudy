package com.gwgl.sms.managent;
import com.gwgl.sms.data.Customer;
import java.util.Scanner;
public class CustManager {
Customer[] customers=new Customer[100];
/**
 * 增加会员信息
 *@param cust 新增会员
 */
public void add(Customer cust){
	for(int i=0;i<customers.length;i++){
		if(customers[i]==null){
			customers[i]=cust;
			break;
		}
	}
}
/* *输入会员信息
*
*/
    public void showCustomers(){
        System.out.println("**会员列表**");
        System.out.println("编号\t生日\t积分");

        int i=0;
        while (customers[i]!=null){
            System.out.println(customers[i].custNO+"\t"+customers[i].custBirthday+"\t"+customers[i].custscore);
            i++;
        }

    }
    /* *
     * 通过会员编号查找会员积分
     * @param custNO 会员编号
     * @return 会员积分
     */
    public int searchSocre(int custNO){
        int i= 0;
        int score=-1;
        while(customers[i]!=null){
            if(customers[i].custNO==custNO){
                score=customers[i].custscore;
                break;
            }
            i++;
        }
        return score;
    }
    /* *
    *通过会员编号查找会员，修改会员信息
    *
    * @param custNO 会员编号
    * @return 会员
     */
    public void edit(int custNO,String custBirthday,int custscore){
        int i=0;
        while(customers[i]!=null){
            if(customers[i].custNO==custNO){
                customers[i].custBirthday=custBirthday;
                customers[i].custscore=custscore;
                break;
            }
            i++;
        }
        if (customers[i]==null || i==100){
            System.out.println("会员不存在");
        }
    }

}
