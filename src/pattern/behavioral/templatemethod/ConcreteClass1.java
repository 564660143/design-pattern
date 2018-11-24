package pattern.behavioral.templatemethod;

/**
 * 子类1 : 将大象放入冰箱
 *
 * @author 七夜雪
 * @create 2018-11-24 11:08
 */
public class ConcreteClass1 extends AbstractClass {

    @Override
    public void put() {
        System.out.println("将大象放入冰箱...");
    }

    @Override
    public boolean isNeedPrepare() {
        return true;
    }
}
