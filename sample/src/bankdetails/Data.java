package bankdetails;

public class Data {
	
	private String name;		//Private data type for sensitive data that should not be easily accessed
	private int accnum;
	private String bankname;
	private String ifcscode;
	private int balance=1000;
	private int deposit;
	private int withdrawal;
	
	public String getName() {		//Getter and setters for accessing the data when necessary
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccnum() {
		return accnum;
	}
	public void setAccnum(int accnum) {
		this.accnum = accnum;
	}
	public String getIfcscode() {
		return ifcscode;
	}
	public void setIfcscode(String ifcscode) {
		this.ifcscode = ifcscode;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public int getWithdrawal() {
		return withdrawal;
	}
	public void setWithdrawal(int withdrawal) {
		this.withdrawal = withdrawal;
	}
	
}
