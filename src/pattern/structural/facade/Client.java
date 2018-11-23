package pattern.structural.facade;

/**
 * 测试类
 *
 * @author 七夜雪
 * @create 2018-11-23 14:07
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.open();
    }
}
