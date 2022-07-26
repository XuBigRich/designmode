package strategy;

import java.util.function.Function;

/**
 * @Author： hongzhi.xu
 * @Date: 2022/7/19 9:53 下午
 * @Version 1.0
 */
public class Strategy2 implements Function<Integer, String> {
    public Strategy2(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String apply(Integer o) {
        return name+"策略2"+o;
    }
}
