package pattern.structural.decorator;

/**
 * 糖装饰类 : 表示向咖啡中加一份糖
 *
 * @author 七夜雪
 * @create 2018-11-23 14:44
 */
public class SugarDecorator implements ICoffee {
    private String desc;
    private int price;

    public SugarDecorator(ICoffee coffee) {
        this.desc = coffee.getDesc() + " 加一份糖";
        // 表示每加一份牛奶, 价格增加2元
        this.price = coffee.getPrice() + 2;
    }

    @Override
    public void showDesc() {
        System.out.println(desc + "  价格为:" + price);
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getDesc() {
        return desc;
    }
}
