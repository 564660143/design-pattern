package pattern.behavioral.templatemethod;

/**
 * 子类2 : 将老虎放入冰箱
 *
 * @author 七夜雪
 * @create 2018-11-24 11:08
 */
public class ConcreteClass2 extends AbstractClass {

    @Override
    public void put() {
        System.out.println("将老虎放入冰箱...");
    }
}
