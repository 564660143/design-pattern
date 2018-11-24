package pattern.structural.proxy.staticproxy;

/**
 * 测试类
 *
 * @author 七夜雪
 * @create 2018-11-24 9:34
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.showName();
    }
}
