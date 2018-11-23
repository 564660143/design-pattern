package pattern.creational.singleton;

/**
 * @author 七夜雪
 * 使用枚举实现单例
 * @create 2018-11-23 0:11
 */
public enum EnumSingleton {
    INSTANCE;

    private Object data;

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
