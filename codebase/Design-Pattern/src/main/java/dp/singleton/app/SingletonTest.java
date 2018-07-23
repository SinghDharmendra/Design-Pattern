package dp.singleton.app;

import dp.singleton.eager.SingletonStaticBlock;

public class SingletonTest {
   
  public static void main(String[] args) {
   SingletonStaticBlock instance=SingletonStaticBlock.getInstance();
   SingletonStaticBlock instance1=SingletonStaticBlock.getInstance();
   System.out.println("instance:"+instance.hashCode());
   System.out.println("instance1:"+instance1.hashCode());
}
}
