package pattern.structural.adapter.classadapter;

/**
 * Target的一个实现类
 * @author 七夜雪
 * @create 2018-11-23 16:14
 */
public class TargetImpl implements Target {
    @Override
    public void request() {
        System.out.println("TargetImpl 方法...");
    }
}
