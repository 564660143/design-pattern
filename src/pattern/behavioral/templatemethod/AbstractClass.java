package pattern.behavioral.templatemethod;

/**
 * 抽象类
 *
 * @author 七夜雪
 * @create 2018-11-24 11:02
 */
public abstract class AbstractClass {
    public void excute(){
        if (isNeedPrepare()) {
            prepare();
        }
        openFridge();
        put();
        closeFridge();
    }


    public void prepare(){
        System.out.println("给冰箱通电...");
    }

    // 钩子方法, 子类可以通过重写这个方法控制prepare方法是否执行
    public boolean isNeedPrepare(){
        return false;
    }

    public void openFridge(){
        System.out.println("打开冰箱...");
    }

    public abstract void put();

    public void closeFridge(){
        System.out.println("关闭冰箱...");
    }
}
