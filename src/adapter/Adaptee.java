package adapter;

/**
 * 装饰器模式 ，Adaptee 拥有 真正的报时方法 sayTime方法，
 * 但是 客户端只能调用Target执行报时功能
 *
 * @Author： hongzhi.xu
 * @Date: 2023/8/18 20:44
 * @Version 1.0
 */
public class Adaptee {
    //真正实现报时的功能
    public void sayTime(String time) {
        System.out.println("当前时间是:" + time);
    }
}
