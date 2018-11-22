package pattern.creational.simplefactory;

/**
 * 简单工厂测试类
 *
 * @author 七夜雪
 * @create 2018-11-22 10:23
 */
public class Test {

    public static void main(String[] args) {
        JuiceFactory factory = new JuiceFactory();
        Juice juice;
        juice = factory.getJuice("apple");
        System.out.println(juice.showName());
        // 使用反射扩展可以不用直接修改工厂类
        juice = factory.getJuice(WatermelonJuice.class);
        System.out.println(juice.showName());
    }
}
