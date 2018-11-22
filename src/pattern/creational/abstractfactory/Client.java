package pattern.creational.abstractfactory;

/**
 * 抽象工厂测试类
 * @author 七夜雪
 * 2018/11/14 10:04
 */
public class Client {

    public static void main(String[] args) {
        // 获取套餐A
        KFCFactory factory1 = new ProductAFactory();
        factory1.getFood().produce();
        factory1.getDrink().produce();
        // 获取套餐B
        KFCFactory factory2 = new ProductBFactory();
        factory2.getFood().produce();
        factory2.getDrink().produce();
    }

}
