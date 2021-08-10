package service_locator_pattern.locator;

import service_locator_pattern.cache.Cache;
import service_locator_pattern.context.InitialContext;
import service_locator_pattern.service.Service;

public class ServiceLocator {
   private static Cache cache;
 
   static {
      cache = new Cache();    
   }
 
   public static Service getService(String jndiName){
 
      Service service = cache.getService(jndiName);
 
      if(service != null){
         return service;
      }
 
      InitialContext context = new InitialContext();
      Service service1 = (Service)context.lookup(jndiName);
      cache.addService(service1);
      return service1;
   }
}