package test;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Iterator;
import java.util.Set;

/**
 * @author: bxguo
 * @time: 2019/11/20 14:28
 */
@HandlesTypes(Selfrun.class)
public class MyContainerInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        Iterator<Class<?>> iterator = set.iterator();
        Class<?> next = iterator.next();
        try {
            SelfrunImpl o = (SelfrunImpl)next.newInstance();
            o.fun();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
