package mediation;

import mediation.colleagues.AppServer;
import mediation.colleagues.AutoServer;
import mediation.colleagues.DBPServer;
import mediation.colleagues.TomcatServer;
import mediation.mediator.IMediator;
import mediation.mediator.Mediator;

/**
 * 本例中，同事对象不需要关注其他同事对象，但这样可能会造成中介者的实现特别复杂！
 *
 * 实际应用中，对于发送消息的同事而言，知道其消息的接收者是谁，请求中介者时，
 * 需要将自己（消息的发送者）和目的同事（消息的接收者）传递给中介者，这样可方便中介者的实现，
 * 对外部逻辑影响并不大，因为消息发送者并不需要操作接受者的具体信息（如内部结构，方法等），只需要知道是谁即可。
 */
public class MediatorTest {
    public static void main(String[] args) {
        AppServer appServer = new AppServer();
        AutoServer autoServer = new AutoServer();
        DBPServer dbpServer = new DBPServer();
        TomcatServer tomcatServer = new TomcatServer();
        IMediator mediator = new Mediator(appServer, autoServer, dbpServer, tomcatServer);
        autoServer.sendMsg("查询待充值订单");
    }
}