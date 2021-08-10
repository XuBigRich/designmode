package listener.spring.envent;

import java.util.EventObject;

/**
 * @Author： hongzhi.xu
 * @Date: 2021/8/7 下午12:14
 * @Version 1.0
 */
public class ApplicationEnvironmentPreparedEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationEnvironmentPreparedEvent(Object source) {
        super(source);
    }
}
