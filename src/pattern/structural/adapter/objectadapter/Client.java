package pattern.structural.adapter.objectadapter;

/**
 * 测试类
 *
 * @author 七夜雪
 * @create 2018-11-23 16:16
 */
public class Client {

    public static void main(String[] args) {
        Target target = new TargetImpl();
        target.request();
        target = new Adapter();
        target.request();
    }
}
