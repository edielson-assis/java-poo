package entities;

public class CheckingAccount extends Account {

    public CheckingAccount() {
        super();
    }

    public CheckingAccount(Integer number, String holder, Double balance) {
        super(number, holder, balance);
    }
	
    @Override
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
}
