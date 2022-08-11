package mediation.colleagues;

import mediation.mediator.IMediator;

/**
 * 负责向代理商发送充值/查询请求
 */
public class TomcatServer extends AbstractStation {
    public TomcatServer(){
    }
    public TomcatServer(String name, IMediator mediator){
        super(name, mediator);
    }

    public void getMsg(String msg){
        System.out.println("TomcatServer接收消息：" + msg);
        System.out.println("TomcatServer向代理商请求充值");
        this.sendMsg("充值结果，充值成功... ...");
    }

    void sendMsg(String msg){
        this.mediator.contact(msg);
    }
}