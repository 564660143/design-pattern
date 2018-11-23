package pattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器单例
 *
 * @author 七夜雪
 * @create 2018-11-23 1:44
 */
public class ContainerSingleton {
    private static Map<String, Object> map = new HashMap<>();

    private ContainerSingleton() {
    }

    public void putInstance(String key, Object instance) {
        if (key != null && instance != null && !"".equals(key)){
            if (!map.containsKey(key)){
                map.put(key, instance);
            }
        }
    }

    public Object getInstance(String key) {
        return map.get(key);
    }


}
