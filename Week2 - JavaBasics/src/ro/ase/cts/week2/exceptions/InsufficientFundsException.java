package ro.ase.cts.week2.exceptions;

public class InsufficientFundsException extends Exception {
	public InsufficientFundsException(String message) {
		super(message); // we use the base class constructor (super) to pass the message to "Exception" class
	}

	public InsufficientFundsException() {

	}
}
