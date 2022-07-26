package strategy;

import java.util.function.Function;

/**
 * @Author： hongzhi.xu
 * @Date: 2022/7/19 9:36 下午
 * @Version 1.0
 */
public class StrategyMode {
    public void process(int i) {
        Function<Integer, String> function;
        if (i == 1) {
//            function = this::strategy1;
            function=new Strategy1(this);
        } else {
//            function = this::strategy2;
            function=new Strategy2("策略");
        }
        System.out.println(function.apply(i));
    }

    public String strategy1(int i) {
        return "当前策略1" + i;
    }

    public String strategy2(int i) {
        return "当前策略2" + i;
    }

    public static void main(String[] args) {
        StrategyMode strategyMode=new StrategyMode();
        strategyMode.process(1);
        strategyMode.process(2);
    }
}
