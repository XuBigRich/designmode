package unknown;


/**
 * 在Tomcat中 xml解析的地方 rule 类 就大量使用了 该设计模式
 * 根据实例不同 子类会覆盖父类的方法 ，调用时 会执行子类重写的方法
 * <p>
 * 但是不知道这个设计模式的姓名 等有空了 查一下  然后把包名和类名改一下
 *
 * @Author： hongzhi.xu
 * @Date: 2020/10/26 9:57 上午
 * @Version 1.0
 */
public class StarTest {
    public static void main(String[] args) {
//        UKnown template=new UKnown1();
        UKnown template = new UKnown2();
        template.say();
    }
}
