package pattern.creational.abstractfactory;

/**
 * 套餐B工厂类-包含薯条和果汁
 *
 * @author 七夜雪
 * @create 2018-11-22 15:16
 */
public class ProductBFactory implements KFCFactory {
    @Override
    public Drink getDrink() {
        return new Juice();
    }

    @Override
    public Food getFood() {
        return new Chip();
    }
}
