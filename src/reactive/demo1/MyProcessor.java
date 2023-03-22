package reactive.demo1;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

/**
 * @Author： hongzhi.xu
 * @Date: 2023/3/22 1:55 下午
 * @Version 1.0
 */
public class MyProcessor extends SubmissionPublisher<Integer> implements Flow.Processor<Integer, Integer> {
    private Flow.Subscription subscription;


    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        // 保存订阅关系, 需要用它来给发布者响应
        this.subscription = subscription;
        // 请求一个数据
        this.subscription.request(1);
    }

    @Override
    public void onNext(Integer integer) {
        // 过滤掉小于0的, 然后发布出去
        this.submit(integer);
        // 处理完调用request再请求一个数据
        this.subscription.request(1);
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
        // 全部数据处理完了(发布者关闭了)
        System.out.println("处理器处理完了!");
        // 关闭发布者
        this.close();

    }
}
