package pattern.behavioral.strategy;

/**
 * 测试类
 *
 * @author 七夜雪
 * @create 2018-11-24 14:11
 */
public class Client {
    public static void trip(Strategy strategy){
        strategy.trip();
    }

    public static void main(String[] args) {
        Strategy busStrategy = new BusStrategy();
        Strategy carStrategy = new CarStrategy();
        trip(busStrategy);
        trip(carStrategy);
    }

}
