package listener.one;

/**
 * @Author： hongzhi.xu
 * @Date: 2021/7/30 下午10:57
 * @Version 1.0
 */
public class Start {
    public static void main(String[] args) {
        EventSource eventSource = new EventSource();

        eventSource.addListener(new EventListenerOne() {
            @Override
            public void handleEvent(EventObjectOne event) {
                event.doEvent();
                if (event.getSource().equals("closeWindows")) {
                    System.out.println("doClose");
                }
            }

        });


        /*
         * 传入openWindows事件，通知listener，事件监听器，
         对open事件感兴趣的listener将会执行
         **/
        eventSource.notifyListenerEvents(new EventObjectOne("openWindows"));

    }
}
