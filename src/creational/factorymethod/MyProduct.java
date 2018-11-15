package creational.factorymethod;

/**
 * 产品实现类
 * @author xuxiumeng
 * 2018/11/14 15:58
 */
public class MyProduct implements Product {
    @Override
    public void name() {
        System.out.println("七夜雪");
    }
}
