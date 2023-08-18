package adapter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 此适配器 适配 Adaptee 类 与 Target  接口，实际上可以理解为，让Adaptee变相实现Target接口
 * 适配器要持有要适配的对象，实现要转换成目标的接口
 * @Author： hongzhi.xu
 * @Date: 2023/8/18 20:46
 * @Version 1.0
 */
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void execute(LocalDateTime localDateTime) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
        adaptee.sayTime(localDateTime.format(dateTimeFormatter));
    }
}
