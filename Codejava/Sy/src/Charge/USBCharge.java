package Charge;

interface USB{
    void func();
}
class  Phone implements USB{
    public void func(){
        System.out.println("通过USB接口，手机充电");
    }
}
class USBDisk implements USB{
    public void func(){
        System.out.println("通过USB接口，进行数据转移");
    }
}
