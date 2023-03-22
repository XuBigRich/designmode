package reactive.demo2;

import java.util.concurrent.Flow;

/**
 * @Author： hongzhi.xu
 * @Date: 2023/3/22 2:42 下午
 * @Version 1.0
 */
public class SubscribeDemo implements Flow.Subscriber<Integer> {
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
}
