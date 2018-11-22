package pattern.creational.abstractfactory;

/**
 * 套餐A工厂类-包含可乐和汉堡
 *
 * @author 七夜雪
 * @create 2018-11-22 15:15
 */
public class ProductAFactory implements KFCFactory {
    @Override
    public Drink getDrink() {
        return new Cola();
    }

    @Override
    public Food getFood() {
        return new Hamburger();
    }
}
