package principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * @author 七夜雪
 */
public class Test {
    public static void main(String[] args) {
        Base child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);
    }
}
