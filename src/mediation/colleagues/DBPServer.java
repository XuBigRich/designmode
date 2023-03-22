package mediation.colleagues;

import mediation.mediator.IMediator;

/**
 * 负责数据层访问
 */
public class DBPServer extends AbstractStation {
    public DBPServer(){
    }
    public DBPServer(String name, IMediator mediator){
        super(name, mediator);
    }

    public void getMsg(String msg){
        System.out.println("DBPserver接收消息：" + msg);
        if ("查询待充值订单".equals(msg)) {
            this.sendMsg("待充值订单");
        } else if (msg.indexOf("修改订单状态") > -1) {
            System.out.println("DBP修改订单状态修改完毕");
        }
    }

    void sendMsg(String msg){
        System.out.println("DBPserver发送消息：" + msg);
        this.mediator.contact(msg);
    }
}