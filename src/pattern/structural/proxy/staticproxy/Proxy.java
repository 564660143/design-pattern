package pattern.structural.proxy.staticproxy;

/**
 * 代理类
 *
 * @author 七夜雪
 * @create 2018-11-24 9:32
 */
public class Proxy implements Subject {
    private RealSubject realSubject = new RealSubject();

    @Override
    public void showName() {
        System.out.println("被代理类方法执行之前执行...");
        realSubject.showName();
        System.out.println("被代理类方法执行之后执行...");
    }
}
