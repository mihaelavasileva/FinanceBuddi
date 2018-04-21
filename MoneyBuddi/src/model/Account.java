package model;

public class Account {
	
	private int id;
	private String name;
	private double balance;
	private User user;
	private Currency currency;

	private Account(int id, String name, double balance) throws exceptions.InvalidDataException {
		this.setId(id);
		this.setName(name);
		this.setBalance(balance);
	}
	public Account(int id, String name, double balance, User user, 
			Currency currency) throws  exceptions.InvalidDataException {
		this(id, name, balance);
		this.setUser(user);
		//this.currency.setId(currency.getId()); 
		this.setCurrency(currency);
	}
	
	public Account(int id, String name, double balance,int user_id, int currency_id)
			throws  exceptions.InvalidDataException {
		this(id, name, balance);
		this.user.setId(user_id);
		this.currency.setId(currency_id);
	}
	
	public Account(String name, double balance,User user, Currency currency)
			throws  exceptions.InvalidDataException {
		this.setName(name);
		this.setBalance(balance);
		this.setUser(user);
		this.setCurrency(currency);

	}
	
	//====getters
	public double getBalance() {
		return balance;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public User getUser() {
		return user;
	}
	public int getCurrencyId() {
		return currency.getId();
	}
	
	public Currency getCurrency() {
		return currency;
	}

	//====setters
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setId(long id) {
		this.id = (int)id;
	}
	public void setUser(User user) throws exceptions.InvalidDataException {
		if(user == null) {
			throw new exceptions.InvalidDataException("User cannot be null.");
		}
		this.user = user;
	}
	public void setName(String name) throws exceptions.InvalidDataException {
		if(name==null || name.isEmpty()) {
			throw new exceptions.InvalidDataException("The name of the transaction cannot be null or empty.");
		}
		this.name = name;
	}
	
	public void setCurrencyId(int id) {
		this.currency.setId(id);;
	}
	
	public void setCurrency(Currency currency) throws exceptions.InvalidDataException {
		if(currency==null) {
			throw new exceptions.InvalidDataException("Currency cannot be null");
		}
		
		this.currency=currency;
	}
}
