
public class Main {
	public static void main(String[] args) {
		Bond bond = new Bond(); // Example: Creating a bond with a term of 24 months
		bond.setTerm(10);
		bond.setBalance(100000);
		System.out.println("Total Earned: " + bond.calculateTotalEarned());
		System.out.println("Interest Rate: " + bond.getInterestRate() + "%");
		  
	}
}
