package com.test.designpatterns;

public class BuilderDesignPattern {
	public static void main(String[] args) {
		String bankName = "SaigonTechnologyBank";

		String accountNumber = "STS7777777";

		String idNumber = "7777777";

		BankAccount account = new BankAccount.BankAccountBuilder(bankName, accountNumber, idNumber)

				.withFullName("Wind Hero")

				.withAddress("MID")

				.build();

	}
}
