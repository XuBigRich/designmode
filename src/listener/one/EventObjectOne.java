package listener.one;

public class EventObjectOne extends java.util.EventObject {
    private static final long serialVersionUID = 1L;

    public EventObjectOne(Object source) {
        super(source);
    }

    public void doEvent() {
        System.out.println("通知一个事件源 source :" + this.getSource());
    }

}