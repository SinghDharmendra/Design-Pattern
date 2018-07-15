package dp.creational.prototype.factory;

import java.util.HashMap;
import java.util.Map;

import dp.creational.prototype.contract.Prototype;
import dp.creational.prototype.model.Album;
import dp.creational.prototype.model.Movie;
import dp.creational.prototype.model.Show;

public class PrototypeFactory {
   
   public static class ModelType{
      public static final String MOVIE="movie";
      public static final String ALBUM="album";
      public static final String SHOW="show";
   }
   
  private static  Map<String, Prototype> prototypes=new HashMap<>();
  
  static {
     prototypes.put(ModelType.MOVIE, new Movie());
     prototypes.put(ModelType.ALBUM, new Album());
     prototypes.put(ModelType.SHOW, new Show());
     
  }
  
  public static Prototype getInstance(String model) throws CloneNotSupportedException {
   return  prototypes.get(model).clone();
  }

}
