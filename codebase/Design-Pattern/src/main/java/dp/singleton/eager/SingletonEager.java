package dp.singleton.eager;

public class SingletonEager {
   private static final SingletonEager instance=new SingletonEager();
   /**
    * private constructor
    */
   private SingletonEager(){
      
   }
   
   public static SingletonEager getInstance() {
      return instance;
   }

}
