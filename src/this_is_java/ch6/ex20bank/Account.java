package this_is_java.ch6.ex20bank;

public class Account {

	private String ano;
	private String owner;
	private int balance;
	
	
	public Account(String ano, String owner, int balance) {
		this.setAno(ano);
		this.setBalance(balance);
		this.setOwner(owner);
	}


	public String getAno() {return ano;}
	public void setAno(String ano) {this.ano = ano;}


	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner = owner;}


	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance = balance;}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
