package pattern.structural.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 *
 * @author 七夜雪
 * @create 2018-11-24 9:55
 */
public class DynamicProxy implements InvocationHandler {
    private Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind(){
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeMethod();
        Object invoke = method.invoke(target, args);
        afterMethod();
        return invoke;
    }

    private void beforeMethod(){
        System.out.println("动态代理 before code");
    }

    private void afterMethod(){
        System.out.println("动态代理 after code");
    }
}
