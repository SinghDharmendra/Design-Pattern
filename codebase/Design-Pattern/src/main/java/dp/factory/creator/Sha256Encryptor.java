package dp.factory.creator;

import dp.factory.product.EncryptionAlgorithm;
import dp.factory.product.Sha256EncryptionAlgorithm;

public class Sha256Encryptor extends Encryptor {

   @Override
   public EncryptionAlgorithm getEncryptionAlgorithm() {     
      return new Sha256EncryptionAlgorithm();
   }

}
