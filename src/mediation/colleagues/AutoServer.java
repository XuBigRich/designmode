package mediation.colleagues;

import mediation.mediator.IMediator;

/**
 * 负责扫描待充值/查询的订单
 */
public class AutoServer extends AbstractStation {
    public AutoServer(){
    }
    public AutoServer(String name, IMediator mediator){
        super(name, mediator);
    }
    public void getMsg(String msg){
        System.out.println("AutoServer接收消息：" + msg);
        if ("待充值订单".equals(msg)) {
            this.sendMsg("请求充值");
        }
    }

    public void sendMsg(String msg){
        System.out.println("AutoServer发送消息：" + msg);
        this.mediator.contact(msg);
    }
}