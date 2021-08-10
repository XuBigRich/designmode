package listener.one.two;

import listener.one.EventListenerOne;
import listener.one.EventObjectOne;

import java.util.Vector;

/**
 * 演示事件监听模式如何监听自己感兴趣的 事件
 * <p>
 * 他的重点在于监听器的实现，在什么状态下才去执行事件的回调
 */
public class EventSource {
    //监听器列表，监听器的注册则加入此列表
    private Vector<EventListenerOne> ListenerList = new Vector<EventListenerOne>();

    //接受外部事件   传入事件 遍历监听器
    public void notifyListenerEvents(EventObjectOne event) {
        for (EventListenerOne eventListener : ListenerList) {
            //遍历所有监听器 监听条件执行 回调 handleEvent方法
            eventListener.handleEvent(event);
        }
    }

    //接收注册监听器
    public void onCloseWindows(EventListenerOne eventListener) {
        System.out.println("关注关闭窗口事件");
        ListenerList.add(eventListener);
    }

    //当有关闭命令发送时  触发一个关闭事件
    public void doCloseWindows() {
        //关闭窗口，监听closeWindows 事件
        this.notifyListenerEvents(new EventObjectOne("closeWindows"));
    }

    public static void main(String[] args) {
        EventSource windows = new EventSource();
        /**
         * 另一种实现方式
         */
        //添加监听器，注册一个关闭事件，并实现回调接口
        windows.onCloseWindows(new EventListenerOne() {

            @Override
            public void handleEvent(EventObjectOne event) {
                event.doEvent();
                //设立监听执行条件，当事件为closeWindows才会执行
                if (event.getSource().equals("closeWindows")) {
                    System.out.println("通过onCloseWindows来关注关闭窗口事件：并执行成功。 closeWindows");
                }

            }

        });

        //窗口关闭动作
        windows.doCloseWindows();

    }
}