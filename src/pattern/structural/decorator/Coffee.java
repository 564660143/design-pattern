package pattern.structural.decorator;

/**
 * 普通的Coffee类
 *
 * @author 七夜雪
 * @create 2018-11-23 14:41
 */
public class Coffee implements ICoffee {
    private String desc = "一杯咖啡";
    private int price = 20;

    @Override
    public void showDesc() {
        System.out.println(desc + "  价格为:" + price);
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
