package adapter;

import java.time.LocalDateTime;

/**
 * Target 可以实现报时功能
 * @Author： hongzhi.xu
 * @Date: 2023/8/18 20:46
 * @Version 1.0
 */
public interface Target {
    //报时功能
    void execute(LocalDateTime localDateTime);
}
