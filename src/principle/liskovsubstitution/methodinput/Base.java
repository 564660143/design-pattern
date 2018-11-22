package principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * @author 七夜雪
 */
public class Base {
    public void method(HashMap map){
        System.out.println("父类被执行");
    }
}
