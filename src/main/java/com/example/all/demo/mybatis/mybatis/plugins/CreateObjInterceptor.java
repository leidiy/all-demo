package com.example.all.demo.mybatis.mybatis.plugins;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;

import java.util.Properties;

/**
 * mybatis在创建对象的时候进行拦截
 * MyBatis 自定义拦截器，可以拦截的接口只有四种
 * Executor.class，
 * StatementHandler.class，
 * ParameterHandler.class
 * 和 ResultSetHandler.class。
 * （1）@Signature 的参数：
 * <p>
 * ----1》type：要拦截的接口
 * <p>
 * ----2》method：需要拦截的方法，存在于要拦截的接口之中
 * <p>
 * ----3》args：被拦截的方法所需要的参数
 *
 * @author 72082934
 */
@Intercepts(
        @Signature(method = "update",
                type = Executor.class,
                args = {MappedStatement.class, Object.class}
        )
)
public class CreateObjInterceptor implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("被拦截方法执行之前，做的辅助服务······");
        Object proceed = invocation.proceed();
        System.out.println("被拦截方法执行之后，做的辅助服务······");
        return proceed;
    }

    /**
     * @param target 表示被拦截的对象，此处为 Executor 的实例对象
     *               作用：如果被拦截对象所在的类有实现接口，就为当前拦截对象生成一个代理对象
     *               如果被拦截对象所在的类没有指定接口，这个对象之后的行为就不会被代理操作
     * @return
     */
    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
        String key = properties.getProperty("key");
        String property = properties.getProperty("property");
        System.out.println(key);
        System.out.println(property);
    }
}
