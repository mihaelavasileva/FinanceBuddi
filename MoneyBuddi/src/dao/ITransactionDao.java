package dao;

import java.sql.SQLException;
import java.util.Collection;

import exceptions.InvalidDataException;
import model.Transaction;
import model.User;

public interface ITransactionDao {

	void addTransaction(Transaction transaction) throws SQLException;
	
	void deleteTransaction(Transaction transaction) throws SQLException;
	
	void changeTransaction(Transaction transaction) throws SQLException;
	
	Collection<Transaction> getAllTransactionsByUser(User u) throws SQLException,InvalidDataException;
}
