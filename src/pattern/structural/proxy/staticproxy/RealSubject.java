package pattern.structural.proxy.staticproxy;

/**
 * 被代理类
 *
 * @author 七夜雪
 * @create 2018-11-24 9:30
 */
public class RealSubject implements Subject {

    @Override
    public void showName() {
        System.out.println("被代理类方法---");
    }
}
