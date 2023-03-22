package mediation.colleagues;

import mediation.mediator.IMediator;

/**
 * 负责业务处理
 */
public class AppServer extends AbstractStation {
    public AppServer(){
    }

    public AppServer(String name, IMediator mediator){
        super(name, mediator);
    }

    public void getMsg(String msg){
        System.out.println("APPserver接收消息：" + msg);
        if ("请求充值".equals(msg)) {
            this.sendMsg("请发送至代理商");
        } else if (msg.indexOf("充值结果") > -1) {
            this.sendMsg("修改订单状态，充值中");
        }
    }

    void sendMsg(String msg){
        this.mediator.contact(msg);
    }
}