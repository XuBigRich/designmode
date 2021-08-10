package listener.one;



/**
 * 什么是事件监听器
 * <p>
 * 监听器将监听自己感兴趣的事件一旦该事件被触发或改变，立即得到通知，做出响应。例如：Android程序中的Button事件。
 * <p>
 * Java的事件监听机制可概括为3点：
 * <p>
 * Java的事件监听机制涉及到事件源，事件监听器，事件对象三个组件,监听器一般是接口，用来约定调用方式。
 * 当事件源对象上发生操作时，它将会调用事件监听器的一个方法，并在调用该方法时传递事件对象过去。
 * 事件监听器实现类,通常是由开发人员编写，开发人员通过事件对象拿到事件源，从而对事件源上的操作进行处理。
 *
 *
 * 通常用法：
 *      通常监听器的 事件处理方法 都是用来 判断事件类型的，然后再根据事件类型做出 相应的 事件处理。
 *      这些相应的处理 通常是对事件源的 回调处理，但也可以不是（非强制，根据当前事件的需求来定）
 *      事件对象是用来包装事件源的，使其可以被监听器所接收
 *
 *
 * <p>
 * 这里我为了方便，直接使用JDK，EventListener 监听器，感兴趣的可以去研究下源码，非常简单。
 * <p>
 * 监听器接口
 */
public interface EventListenerOne extends java.util.EventListener {
    //事件处理
    public void handleEvent(EventObjectOne event);
}