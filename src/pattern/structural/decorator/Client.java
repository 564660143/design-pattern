package pattern.structural.decorator;

/**
 * 测试类
 *
 * @author 七夜雪
 * @create 2018-11-23 14:51
 */
public class Client {

    public static void main(String[] args) {
        ICoffee coffee = new Coffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        coffee.showDesc();
    }

}
