package pattern.structural.proxy.dynamicproxy;


/**
 * 测试类
 *
 * @author 七夜雪
 * @create 2018-11-24 9:34
 */
public class Client {

    public static void main(String[] args) {
        Subject proxy1 = (Subject) new DynamicProxy(new RealSubject1()).bind();
        Subject proxy2 = (Subject) new DynamicProxy(new RealSubject2()).bind();
        proxy1.showName();
        proxy2.showName();
    }
}
