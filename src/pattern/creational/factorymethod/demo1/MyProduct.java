package pattern.creational.factorymethod.demo1;

/**
 * 产品实现类
 * @author 七夜雪
 * 2018/11/14 15:58
 */
public class MyProduct implements Product {
    @Override
    public void name() {
        System.out.println("七夜雪");
    }
}
