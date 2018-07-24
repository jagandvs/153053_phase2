package com.capgemini.mypaymentapp.exception;
public class InsufficientBalanceException extends RuntimeException{
	public InsufficientBalanceException() {
		super();
	}
	public InsufficientBalanceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	public InsufficientBalanceException(String message, Throwable cause) {
		super(message, cause);
	}
	public InsufficientBalanceException(String message) {
		super(message);
	}
	public InsufficientBalanceException(Throwable cause) {
		super(cause);
	}
}