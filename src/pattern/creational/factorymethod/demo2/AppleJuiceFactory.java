package pattern.creational.factorymethod.demo2;

/**
 * 苹果汁工厂
 *
 * @author 七夜雪
 * @create 2018-11-22 11:33
 */
public class AppleJuiceFactory extends JuiceFactory {

    @Override
    public Juice getJuice() {
        return new AppleJuice();
    }
}
