package pattern.creational.factorymethod.demo2;

/**
 * 西瓜汁工厂
 *
 * @author 七夜雪
 * @create 2018-11-22 11:33
 */
public class WatermelonJuiceFactory extends JuiceFactory {

    @Override
    public Juice getJuice() {
        return new WatermelonJuice();
    }
}
