package pattern.structural.decorator;

/**
 * 被装饰的类接口
 * 这里也可以使用抽象类实现
 * @author 七夜雪
 * @create 2018-11-23 14:40
 */
public interface ICoffee {
    public void showDesc();

    public String getDesc();

    public int getPrice();
}
