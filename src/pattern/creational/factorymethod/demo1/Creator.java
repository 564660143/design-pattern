package pattern.creational.factorymethod.demo1;

/**
 * 工厂接口
 * @author 七夜雪
 * 2018/11/14 15:55
 */
public interface Creator {

    /**
     * 工厂方法
     * @return
     */
    public Product create();
}
