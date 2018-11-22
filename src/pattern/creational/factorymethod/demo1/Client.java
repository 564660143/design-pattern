package pattern.creational.factorymethod.demo1;

/**
 * 测试类
 * @author 七夜雪
 * 2018/11/14 16:00
 */
public class Client {

    public static void main(String[] args) {
        Creator creator = new MyCreator();
        Product product = creator.create();
        product.name();

    }

}
