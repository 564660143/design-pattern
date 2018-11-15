package creational.abstractfactory;

/**
 * 产品
 * @author xuxiumeng
 * 2018/11/14 10:02
 */
public class Product implements AbstractProduct {
    @Override
    public String name() {
        return "产品";
    }
}
