package service_locator_pattern.context;

import service_locator_pattern.service.Service1;
import service_locator_pattern.service.Service2;

/**
 * Context / 初始的 Context - JNDI Context 带有对要查找的服务的引用。
 */
public class InitialContext {
    public Object lookup(String jndiName) {
        if (jndiName.equalsIgnoreCase("SERVICE1")) {
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        } else if (jndiName.equalsIgnoreCase("SERVICE2")) {
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
        return null;
    }
}