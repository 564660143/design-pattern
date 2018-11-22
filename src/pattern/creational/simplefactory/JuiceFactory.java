package pattern.creational.simplefactory;

/**
 * 简单工厂模式
 * 果汁工厂类
 *
 * @author 七夜雪
 * @create 2018-11-22 10:14
 */
public class JuiceFactory {

    public Juice getJuice(String name){
        if ("apple".equalsIgnoreCase(name)) {
            return new AppleJuice();
        } else if ("orange".equalsIgnoreCase(name)){
            return new OrangeJuice();
        }
        return null;
    }

    /**
     * 使用反射扩展简单工厂模式
     * @param clazz
     * @return
     */
    public Juice getJuice(Class<? extends Juice> clazz){
        Juice juice = null;
        try {
            juice = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return juice;
    }

}
