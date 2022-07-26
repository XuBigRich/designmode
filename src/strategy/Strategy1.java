package strategy;

import java.util.function.Function;

/**
 * @Author： hongzhi.xu
 * @Date: 2022/7/19 9:53 下午
 * @Version 1.0
 */
public class Strategy1 implements Function<Integer, String> {
    public Strategy1(StrategyMode mode) {
        this.mode = mode;
    }

    private StrategyMode mode;

    @Override
    public String apply(Integer o) {
        return mode.hashCode() + "策略1" + o;
    }
}
