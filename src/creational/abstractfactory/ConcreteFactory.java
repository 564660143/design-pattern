package creational.abstractfactory;

/**
 * 实例化工厂
 * @author xuxiumeng
 * 2018/11/14 10:00
 */
public class ConcreteFactory implements AbstractFactory {

    @Override
    public AbstractProduct createProduct() {
        return new Product();
    }
}
