package pattern.creational.singleton;

/**
 * 基于静态内部类的单例模式
 *
 * @author 七夜雪
 * @create 2018-11-22 20:57
 */
public class StaticInnerClassSingleton {
    // 注意私有的构造方法
    private StaticInnerClassSingleton(){

    }

    public StaticInnerClassSingleton getInstance(){
        return InnerClass.instance;
    }

    private static class InnerClass{
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

}
