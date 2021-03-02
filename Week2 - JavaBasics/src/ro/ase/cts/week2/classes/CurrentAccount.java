package ro.ase.cts.week2.classes;

import ro.ase.cts.week2.exceptions.IllegalTransferException;
import ro.ase.cts.week2.exceptions.InsufficientFundsException;

public class CurrentAccount extends BankAccount{

	public static final double MAX_CREDIT = 5000;
	
	public CurrentAccount(String IBAN) {
		super(CurrentAccount.MAX_CREDIT, IBAN);
	}
	
	@Override
	public void deposit(double amount) {
		this.balance += amount;
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount > this.balance)
			throw new InsufficientFundsException("You don't have the required ammount!");
		else
			this.balance -= amount;
	}

	@Override
	public void transfer(Account destination, double amount) throws InsufficientFundsException, IllegalTransferException {
		if (this == destination)
			throw new IllegalTransferException();
		
		this.withdraw(amount);
		destination.deposit(amount);
	}
	
	
}
