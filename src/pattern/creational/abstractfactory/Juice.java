package pattern.creational.abstractfactory;

/**
 * 饮料实现类-果汁
 *
 * @author 七夜雪
 * @create 2018-11-22 15:11
 */
public class Juice implements Drink {
    @Override
    public void produce() {
        System.out.println("获得果汁一杯...");
    }
}
