package pattern.creational.abstractfactory;

/**
 * Food实现类-汉堡
 *
 * @author 七夜雪
 * @create 2018-11-22 15:12
 */
public class Hamburger implements Food {
    @Override
    public void produce() {
        System.out.println("获得汉堡包一个...");
    }
}
