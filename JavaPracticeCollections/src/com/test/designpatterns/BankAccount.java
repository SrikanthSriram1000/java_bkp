package com.test.designpatterns;

public class BankAccount {

	private String bankName; // Required field

	private String accountNumber;// Required field

	private String idNumber; // Required field

	private String fullName;

	private String email;

	private String password;

	private String address;

	public BankAccount(String bankName, String accountNumber, String idNumber) {

		this.bankName = bankName;

		this.accountNumber = accountNumber;

		this.idNumber = idNumber;

	}

	// Getter() and Setter() should be here

	public static class BankAccountBuilder {

		private String bankName; // Required field

		private String accountNumber; // Required field

		private String idNumber; // Required field

		private String fullName;

		private String email;

		private String password;

		private String address;

		public BankAccountBuilder(String bankName, String accountNumber, String idNumber) {

			this.bankName = bankName;

			this.accountNumber = accountNumber;

			this.idNumber = idNumber;

		}

		public BankAccountBuilder withFullName(String fullName) {

			this.fullName = fullName;

			return this;

		}

		public BankAccountBuilder withEmail(String email) {

			this.email = email;

			return this;

		}

		public BankAccountBuilder withPassword(String password) {

			this.password = password;

			return this;

		}

		public BankAccountBuilder withAddress(String address) {

			this.address = address;

			return this;

		}

		public BankAccount build() {

// validation() should be here.

			BankAccount bankAccount = new BankAccount(this.bankName, this.accountNumber, this.idNumber);

			bankAccount.setFullName(this.fullName);

			bankAccount.setEmail(this.email);

			bankAccount.setPassword(this.password);

			bankAccount.setAddress(this.address);

			return bankAccount;

		}

	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}