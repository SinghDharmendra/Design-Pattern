package dp.structural.proxy;

public class Client {
   public static void main(String[] args) {
      
      System.out.println("Proxy DP");
      Internet internet = new ProxyInternet();
      try {
         internet.connectTo("geeksforgeeks.org");
         internet.connectTo("abc.com");
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }
}