package mcy.proxy;

import java.lang.reflect.Proxy;

/**
 * @author : Vic.Yin
 * @version : v.0.1
 * @date : 2018/10/26
 * @Description :
 */
public class MyMain {
    public static void main(String[] args) {
        MyInterfaceImpl impl = new MyInterfaceImpl();
        MyInterface myIf = (MyInterface) Proxy.newProxyInstance(impl.getClass().getClassLoader(), impl.getClass().getInterfaces(), new MyProxy(impl));
        System.out.println(myIf.say("----->Test Proxy"));
    }
}
