package mediation.colleagues;

import mediation.mediator.IMediator;

/**
 * 所有同事的抽象类，每一个同事都应该持有对中介者的引用
 */
public abstract class AbstractStation {
    String name;        //站点名
    IMediator mediator; //中介者

    public AbstractStation(){
    }

    public AbstractStation(String name, IMediator mediator){
        this.name = name;
        this.mediator = mediator;
    }

    public IMediator getMediator(){
        return mediator;
    }
    public void setMediator(IMediator mediator){
        this.mediator = mediator;
    }
}