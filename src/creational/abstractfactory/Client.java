package creational.abstractfactory;

/**
 * 抽象工厂测试类
 * @author xuxiumeng
 * 2018/11/14 10:04
 */
public class Client {


    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory();
        AbstractProduct product = factory.createProduct();
        System.out.println(product.name());
    }

}
