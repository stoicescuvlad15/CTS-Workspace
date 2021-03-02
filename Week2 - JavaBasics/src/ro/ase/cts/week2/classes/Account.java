package ro.ase.cts.week2.classes;

public abstract class Account {
	public abstract void deposit(double amount);

	public abstract void withdraw(double amount);

	public abstract void transfer(Account destination, double amount);

	public abstract double getBalance();
}
