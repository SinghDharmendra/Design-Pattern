package dp.decorator;

class ExternalEmailDecorator extends EmailDecorator {
   private String content;

   public ExternalEmailDecorator(IEmail basicEmail) {
      originalEmail = basicEmail;
   }

   @Override
   public String getContents() {
      content = addDisclaimer(originalEmail.getContents());
      return content;
   }

   private String addDisclaimer(String message) {
      return message + "\n Company Disclaimer";
   }
}