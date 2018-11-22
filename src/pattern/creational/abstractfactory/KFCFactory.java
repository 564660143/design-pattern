package pattern.creational.abstractfactory;

/**
 * 餐厅工厂接口
 *
 * @author 七夜雪
 * @create 2018-11-22 15:01
 */
public interface KFCFactory {
    public Drink getDrink();
    public Food getFood();

}
