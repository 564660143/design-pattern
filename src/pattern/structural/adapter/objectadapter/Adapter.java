package pattern.structural.adapter.objectadapter;

/**
 * 适配器类
 *
 * @author 七夜雪
 * @create 2018-11-23 16:15
 */
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
     adaptee.AdapteeRequest();
    }
}
