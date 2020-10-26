package template;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * 模版设计模式
 * 模版设计模式 会在父类定义一个框架方法 ，决定流程执行顺序
 * <p>
 * 子类只管实现父类的静态方法。
 * 执行顺序由框架方法决定，但流程实现由子类实现
 * <p>
 * AQS锁 使用的父类AbstractQueuedSynchronizer 所实现的方法 就是 模版设计模式
 *
 * @Author： hongzhi.xu
 * @Date: 2020/10/26 9:57 上午
 * @Version 1.0
 */
public class StarTest {
    public static void main(String[] args) {
        SendCustom template = new Realize1();
        template.sendMessage();
//        SendCustom t=new Realize2();
//        t.sendMessage();
    }
}
