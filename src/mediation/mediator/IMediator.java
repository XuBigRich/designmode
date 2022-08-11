package mediation.mediator;

/**
 *  中介者抽象，申明一个联络方法
 */
public interface IMediator {
    /**
     * source和destination的类型设置为Object，实际上可以是中介者所有同事的抽象类
     * 在这个接口里实际上可以不传递source 和 destination参数，根据消息内容判断来源的目的
     * @param message
     */
    void contact(String message);
}