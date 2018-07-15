package dp.factory.app;

import dp.factory.creator.Sha256Encryptor;

public class FactoryMain {
   public static void main(String[] args) {
      String path=System.getProperty("user.dir")+"\\data.txt";
      String content="Dharmendra";
      PersistedFile persistedFile=new PersistedFile(path, content, new Sha256Encryptor());
      persistedFile.persist();
      System.out.println("File persisted!");
      
   }
}
