package ro.ase.cts.week2.classes;

import ro.ase.cts.week2.exceptions.IllegalTransferException;
import ro.ase.cts.week2.exceptions.InsufficientFundsException;

public abstract class Account {
	public abstract void deposit(double amount);

	public abstract void withdraw(double amount) throws InsufficientFundsException;

	public abstract void transfer(Account destination, double amount) throws InsufficientFundsException, IllegalTransferException;

	public abstract double getBalance();
}
