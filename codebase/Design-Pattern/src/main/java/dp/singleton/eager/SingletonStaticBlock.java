package dp.singleton.eager;

public class SingletonStaticBlock {
   private static final SingletonStaticBlock instance;
   private SingletonStaticBlock() {
      
   }
   static {
      instance=new SingletonStaticBlock();
   }
   
   public static  SingletonStaticBlock getInstance() {
      return instance;
   }

}
