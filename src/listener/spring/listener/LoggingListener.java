package listener.spring.listener;

import listener.spring.envent.ApplicationEnvironmentPreparedEvent;
import listener.spring.envent.ApplicationPreparedEvent;
import listener.spring.envent.ApplicationStartingEvent;
import listener.spring.enventSource.EvenSourceSpring;
import listener.spring.listener.ApplicationListener;

import java.util.EventObject;

/**
 * @Author： hongzhi.xu
 * @Date: 2021/8/7 下午12:10
 * @Version 1.0
 */
public class LoggingListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(EventObject event) {
        if (event instanceof ApplicationStartingEvent) {
            onApplicationStartingEvent((ApplicationStartingEvent) event);
        } else if (event instanceof ApplicationEnvironmentPreparedEvent) {
            onApplicationEnvironmentPreparedEvent((ApplicationEnvironmentPreparedEvent) event);
        } else if (event instanceof ApplicationPreparedEvent) {
            onApplicationPreparedEvent((ApplicationPreparedEvent) event);
        }
    }

    public void onApplicationStartingEvent(ApplicationStartingEvent event) {
        EvenSourceSpring evenSourceSpring = (EvenSourceSpring) (event.getSource());
        evenSourceSpring.getStart();
    }

    public void onApplicationEnvironmentPreparedEvent(ApplicationEnvironmentPreparedEvent event) {
        EvenSourceSpring evenSourceSpring = (EvenSourceSpring) (event.getSource());
        evenSourceSpring.env();
    }

    public void onApplicationPreparedEvent(ApplicationPreparedEvent event) {
        //一般情况下都是使用事件源的 属性 去做操作，很少有直接回调事件源的方法的
        EvenSourceSpring evenSourceSpring = (EvenSourceSpring) (event.getSource());
        evenSourceSpring.prepared();
    }

    public static void main(String[] args) {
        LoggingListener loggingListener = new LoggingListener();
        loggingListener.onApplicationEvent(new ApplicationStartingEvent(new EvenSourceSpring()));
    }

}
