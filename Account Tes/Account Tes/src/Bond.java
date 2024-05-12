

public class Bond {
	
	private double balance = 0.0;
    private int term = 0;
    private double interestRate; 
    
    public Bond() {
    	interestRate = fixInterestRate(term);
    }
    
    public double fixInterestRate(int term) {
        if (term >= 0 && term <= 11) {
            return 0.5;
        } else if (term >= 12 && term <= 23) {
            return 1.0;
        } else if (term >= 24 && term <= 35) {
            return 1.5;
        } else if (term >= 36 && term <= 47) {
            return 2.0;
        } else if (term >= 48 && term <= 60) {
            return 2.5;
        } else {
            throw new IllegalArgumentException("Term must be 1-60 months");
        }
    }
    
    public double calculateTotalEarned(){
    	double finalValue = balance;
    	for (int i = 0; i < term; i++) {
			finalValue += finalValue * (interestRate / 100);
		}
    	return finalValue;
    }
    
    public void setBalance(double balance) {
    	this.balance = balance;
    }
    
    public double getBalance() {
    	return balance;
    }
    
    public void setTerm(int term) {
        this.term = term;
    }
    
    public int getTerm() {
        return term;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
