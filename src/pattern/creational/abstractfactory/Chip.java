package pattern.creational.abstractfactory;

/**
 * Food实现类-薯条
 *
 * @author 七夜雪
 * @create 2018-11-22 15:13
 */
public class Chip implements Food {
    @Override
    public void produce() {
        System.out.println("获得薯条一包...");
    }
}
