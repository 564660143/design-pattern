package principle.liskovsubstitution.methodoutput;

import java.util.HashMap;

/**
 * @author 七夜雪
 */
public class Child extends Base {
    @Override
    public HashMap method() {
        HashMap hashMap = new HashMap();
        System.out.println("子类method被执行");
        hashMap.put("message","子类method被执行");
        return hashMap;
    }
}