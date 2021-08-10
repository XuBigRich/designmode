package template;

import java.util.Date;

/**
 * @Author： hongzhi.xu
 * @Date: 2020/10/26 9:55 上午
 * @Version 1.0
 */
public abstract class SendCustom {
    public abstract void to();
    public abstract void from();
    public abstract void content();
    public  void date(){
        System.out.println(new Date());
    }
    public abstract void send();

    //框架方法-----模版方法 子类只管实现流程方法，执行顺序由框架方法决定，但流程实现由子类实现
    public void sendMessage(){
        to();
        from();
        content();
        date();
        send();
    }

}
