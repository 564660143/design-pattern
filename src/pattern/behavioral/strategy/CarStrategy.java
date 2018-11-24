package pattern.behavioral.strategy;

/**
 * 开车出行策略
 *
 * @author 七夜雪
 * @create 2018-11-24 14:10
 */
public class CarStrategy implements Strategy {

    @Override
    public void trip() {
        System.out.println("自驾出行, 方便快捷...");
    }
}
