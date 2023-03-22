package reactive.demo1;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

/**
 * @Author： hongzhi.xu
 * @Date: 2023/3/22 3:07 下午
 * @Version 1.0
 */
public class SumSubscriber implements Flow.Subscriber<Integer> {
    //用于响应的数据 ,每次发布 sum都会变化，称之为响应式编程
    private Integer sum = 0;
    private Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        // 保存订阅关系, 需要用它来给发布者响应
        this.subscription = subscription;
        // 请求一个数据
        this.subscription.request(1);
    }

    @Override
    public void onNext(Integer o) {
        sum += o;
        // 处理完调用request再请求一个数据
        this.subscription.request(1);
        System.out.println("基于发布信息，数据结果发生变化:"+sum);
        // 或者 已经达到了目标, 调用cancel告诉发布者不再接受数据了
        // this.subscription.cancel();
    }

    @Override
    public void onError(Throwable throwable) {
        // 出现了异常(例如处理数据的时候产生了异常)
        throwable.printStackTrace();
        // 我们可以告诉发布者, 后面不接受数据了
        this.subscription.cancel();

    }

    @Override
    public void onComplete() {
        System.out.println("a and b sum is:" + sum);
    }

    public static void main(String[] args) throws InterruptedException {
        SumSubscriber sumSubscriber=new SumSubscriber();
        // 1. 定义发布者, 发布的数据类型是 Integer
        // 直接使用jdk自带的SubmissionPublisher
        SubmissionPublisher<Integer> publiser = new SubmissionPublisher<Integer>();
        // 2. 定义处理器, 对数据进行过滤, 并转换为String类型
        MyProcessor processor = new MyProcessor();
        // 3. 发布者 和 处理器 建立订阅关系
        publiser.subscribe(processor);
        processor.subscribe(sumSubscriber);
        // 6. 生产数据, 并发布
        publiser.submit(1);
        publiser.submit(2);
        publiser.submit(3);
        // 7. 结束后 关闭发布者
        // 正式环境 应该放 finally 或者使用 try-resouce 确保关闭
        publiser.close();
        // 主线程延迟停止, 否则数据没有消费就退出
        Thread.currentThread().join(1000);
    }
}
