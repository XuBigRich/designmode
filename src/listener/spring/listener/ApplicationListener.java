
package listener.spring.listener;


import java.util.EventObject;

public interface ApplicationListener<E extends EventObject> {

    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    void onApplicationEvent(E event);

}
