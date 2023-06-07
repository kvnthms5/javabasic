package jdbc;

public class BankDetailEncap {
	private int AccNum;
	private String Ifsc;
	private String Bank;
	private String Name;
	private int Balance;
	private int pin;
	
	public int getAccNum() {
		return AccNum;
	}
	public void setAccNum(int accNum) {
		AccNum = accNum;
	}
	public String getIfsc() {
		return Ifsc;
	}
	public void setIfsc(String ifsc) {
		Ifsc = ifsc;
	}
	public String getBank() {
		return Bank;
	}
	public void setBank(String bank) {
		Bank = bank;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
}