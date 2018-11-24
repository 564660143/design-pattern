package pattern.behavioral.strategy;

/**
 * 公交出行策略
 *
 * @author 七夜雪
 * @create 2018-11-24 14:10
 */
public class BusStrategy implements Strategy {

    @Override
    public void trip() {
        System.out.println("公交出行, 低碳环保...");
    }
}
