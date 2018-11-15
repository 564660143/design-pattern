package creational.factorymethod;

/**
 * 测试类
 * @author xuxiumeng
 * 2018/11/14 16:00
 */
public class Client {

    public static void main(String[] args) {
        Creator creator = new MyCreator();
        Product product = creator.create();
        product.name();

    }

}
