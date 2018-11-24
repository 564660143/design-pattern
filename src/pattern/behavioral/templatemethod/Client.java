package pattern.behavioral.templatemethod;

/**
 * @author 七夜雪
 * @create 2018-11-24 11:12
 */
public class Client {

    public static void main(String[] args) {
        AbstractClass cls1 = new ConcreteClass1();
        AbstractClass cls2 = new ConcreteClass2();
        cls1.excute();
        cls2.excute();
    }

}
