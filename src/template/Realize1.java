package template;

/**
 * @Author： hongzhi.xu
 * @Date: 2020/10/26 9:56 上午
 * @Version 1.0
 */
public class Realize1 extends SendCustom {

    @Override
    public void to() {
        System.out.println("Big");
    }

    @Override
    public void from() {
        System.out.println("Rich");
    }

    @Override
    public void content() {
        System.out.println("Hello World");
    }

    @Override
    public void send() {
        System.out.println("Send sms");
    }
}
