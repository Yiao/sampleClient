package example;

import mypackage.HelloWorldServiceLocator;
import mypackage.HelloWorld_PortType;

/**
 * Created by YiaoS on 12/16/2015.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
    try {
      HelloWorldServiceLocator locator = new HelloWorldServiceLocator();
      HelloWorld_PortType service = locator.getHelloWorld();
      // If authorization is required
      //((HelloWorldSoapBindingStub)service).setUsername("user3");
      //((HelloWorldSoapBindingStub)service).setPassword("pass3");
      // invoke business method
      String response = service.sayHelloWorldFrom("Yiao SUN");
      System.out.println(response);
    } catch (javax.xml.rpc.ServiceException ex) {
      ex.printStackTrace();
    } catch (java.rmi.RemoteException ex) {
      ex.printStackTrace();
    }  
  }
}
