package dp.factory.creator;

import dp.factory.product.EncryptionAlgorithm;
import dp.factory.product.Sha512EncryptionAlgorithm;

public class Sha512Encryptor extends Encryptor {

   @Override
   public EncryptionAlgorithm getEncryptionAlgorithm() {     
      return new Sha512EncryptionAlgorithm();
   }

}
