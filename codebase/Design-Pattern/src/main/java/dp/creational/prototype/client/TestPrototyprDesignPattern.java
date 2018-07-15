package dp.creational.prototype.client;

import dp.creational.prototype.factory.PrototypeFactory;
import dp.creational.prototype.factory.PrototypeFactory.ModelType;

public class TestPrototyprDesignPattern {

   public static void main(String[] args) {
      
      try {
         String moviePrototype = PrototypeFactory.getInstance(ModelType.MOVIE).toString();
         System.out.println(moviePrototype);

         String albumPrototype = PrototypeFactory.getInstance(ModelType.ALBUM).toString();
         System.out.println(albumPrototype);

         String showPrototype = PrototypeFactory.getInstance(ModelType.SHOW).toString();
         System.out.println(showPrototype);
         
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
      }

   }

}
