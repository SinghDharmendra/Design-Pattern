package dp.builder;

public class BuilderDesignPattern {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount.Builder(1565).withOwner("Dharmendra").atRate(2.5).build();
		System.out.println(bankAccount);
	}

}
