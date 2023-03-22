package reactive.demo2;

import java.util.Arrays;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

/**
 * @Author： hongzhi.xu
 * @Date: 2023/3/22 2:41 下午
 * @Version 1.0
 */
public class ReactiveDemo {
    private static SubscribeDemo subscribeDemo=new SubscribeDemo();

    public static void main(String[] args) throws InterruptedException {
        SubmissionPublisher<Integer> publisher = new SubmissionPublisher<>();
        publisher.subscribe(subscribeDemo);
        Arrays.asList(1, 2).stream().forEach(publisher::submit);
        subscribeDemo.onComplete();

        Arrays.asList(3, 4).stream().forEach(publisher::submit);
        subscribeDemo.onComplete();
        publisher.close();
    }
}
