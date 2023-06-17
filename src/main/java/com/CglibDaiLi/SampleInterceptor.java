package com.CglibDaiLi;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

//SampleInterceptor类：它将拦截目标类的方法调用并添加额外的行为，实现了MethodInterceptor方法
public class SampleInterceptor implements MethodInterceptor {
    //intercept 方法允许我们在目标方法调用之前和之后添加额外的逻辑。
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        //首先输出了 "方法调用前" 的信息
        System.out.println("方法调用前");

        // 使用 proxy.invokeSuper(obj, args) 调用目标方法。
        Object result = proxy.invokeSuper(obj, args);

        //输出了 "方法调用后" 的信息，并返回方法调用的结果。
        System.out.println("方法调用后");
        return result;
    }
}
