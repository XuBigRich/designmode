package mediation.mediator;

import mediation.colleagues.AppServer;
import mediation.colleagues.AutoServer;
import mediation.colleagues.DBPServer;
import mediation.colleagues.TomcatServer;

/**
 * @description
 * @author panteng
 * @date 17-2-22.
 */
public class Mediator implements IMediator {
    AppServer appServer;
    AutoServer autoServer;
    DBPServer dbpServer;
    TomcatServer tomcatServer;

    public Mediator(){
    }
    public Mediator(AppServer appServer, AutoServer autoServer, DBPServer dbpServer, TomcatServer tomcatServer){
        this.appServer = appServer;
        this.autoServer = autoServer;
        this.dbpServer = dbpServer;
        this.tomcatServer = tomcatServer;

        this.appServer.setMediator(this);
        this.autoServer.setMediator(this);
        this.dbpServer.setMediator(this);
        this.tomcatServer.setMediator(this);
    }
    /**
     * source和destination的类型设置为Object，实际上可以是中介者所有同事的抽象类
     * @param message
     */
    @Override
    public void contact(String message){
        if (message.indexOf("增") > -1 || message.indexOf("删") > -1 || message.indexOf("改") > -1 || message.indexOf("查") > -1) {
            this.dbpServer.getMsg(message);
            return;
        }
        if (message.indexOf("待") > -1) {
            this.autoServer.getMsg(message);
            return;
        }
        if ("请求充值".equals(message) || message.indexOf("充值结果") > -1) {
            this.appServer.getMsg(message);
        }
        if ("请发送至代理商".equals(message)) {
            this.tomcatServer.getMsg(message);
        }
    }
}