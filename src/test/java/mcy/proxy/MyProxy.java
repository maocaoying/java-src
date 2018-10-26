package mcy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author : Vic.Yin
 * @version : v.0.1
 * @date : 2018/10/26
 * @Description :
 */
public class MyProxy implements InvocationHandler {
    private Object o;

    public MyProxy() {

    }
    public MyProxy(Object o) {
        this.o = o;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("--------->执行之前《---------》");
        Object o1 = method.invoke(o, args);
        System.out.println("--------->执行之后《---------》");
        return o1;
    }
}
