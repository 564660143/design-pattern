package pattern.structural.adapter.classadapter;

/**
 * 适配器类
 *
 * @author 七夜雪
 * @create 2018-11-23 16:15
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.AdapteeRequest();
    }
}
