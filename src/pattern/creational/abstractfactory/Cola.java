package pattern.creational.abstractfactory;

/**
 * 饮料实现类-可乐
 *
 * @author 七夜雪
 * @create 2018-11-22 15:10
 */
public class Cola implements Drink {
    @Override
    public void produce() {
        System.out.println("获得可乐一听...");
    }
}
