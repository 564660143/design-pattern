package pattern.creational.factorymethod.demo1;

/**
 * 工厂实现类
 * @author 七夜雪
 * 2018/11/14 15:56
 */
public class MyCreator implements Creator {

    @Override
    public Product create() {
        return new MyProduct();
    }
}
