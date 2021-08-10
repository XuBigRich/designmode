package listener.one;

import java.util.Vector;

//事件源是事件对象的入口，包含监听器的注册、撤销、通知
public class EventSource {
    //监听器列表，监听器的注册则加入此列表
    private Vector<EventListenerOne> ListenerList = new Vector<EventListenerOne>();

    //注册监听器
    public void addListener(EventListenerOne eventListener) {
        ListenerList.add(eventListener);
    }

    //撤销注册
    public void removeListener(EventListenerOne eventListener) {
        ListenerList.remove(eventListener);
    }

    //接受外部事件
    public void notifyListenerEvents(EventObjectOne event) {
        for (EventListenerOne eventListener : ListenerList) {
            eventListener.handleEvent(event);
        }
    }

}