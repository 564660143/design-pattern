package pattern.creational.factorymethod.demo2;

/**
 * 简单工厂测试类
 *
 * @author 七夜雪
 * @create 2018-11-22 10:23
 */
public class Test {

    public static void main(String[] args) {
        JuiceFactory factory1 = new OrangeJuiceFactory();
        Juice juice1 = factory1.getJuice();
        System.out.println(juice1.showName());
        JuiceFactory factory2 = new AppleJuiceFactory();
        Juice juice2 = factory2.getJuice();
        System.out.println(juice2.showName());
        JuiceFactory factory3 = new WatermelonJuiceFactory();
        Juice juice3 = factory3.getJuice();
        System.out.println(juice3.showName());
    }
}
