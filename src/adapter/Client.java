package adapter;

import java.time.LocalDateTime;

/**
 * 1。装饰器模式 ，Adaptee 拥有 真正的报时方法 sayTime方法，
 * 2. 但是 客户端只能调用Target执行报时功能,由依赖方法写死
 * 3。 这个时候可以借助适配器 方法 ，去实现Target接口方法，然后在适配器中，提供Adaptee类所需要的入参
 * 这就是适配器模式，他可以适配原本不支持的方法调用
 *
 * @Author： hongzhi.xu
 * @Date: 2023/8/18 20:46
 * @Version 1.0
 */

public class Client {

    private Target target;

    public Client(Target target) {
        this.target = target;
    }

    public void press(LocalDateTime localDateTime) {
        System.out.println("我是客户端,我要实现报时功能，我只执行Target方法");
        target.execute(localDateTime);
    }

    public static void main(String[] args) {
        Client client = new Client(new Adapter());
        client.press(LocalDateTime.now());
    }
}
