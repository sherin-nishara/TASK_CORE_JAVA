import java.util.List;

public class Customer{
  long accountNumber;
  String name;
  double balance;
  List<Transaction> transactionList;
  Contact contact;
  
  public void setAccountNumber(long accountNumber){
    this.accountNumber = accountNumber;
  }
  public void setName(String name){
    this.name= name;
  }
   public void setBalance(double balance){
    this.balance = balance;
  }
  public void setContact(Contact contact){
    this.contact = contact;
  }
  public void setTransactionList(List<Transaction> transactionList){
    this.transactionList = transactionList;
  }
  public long getAccountNumber(){
    return accountNumber;
  }
  public double getBalance(){
    return balance;
  }
  public String getDetails(){
    return "account number: "+ accountNumber + "\nName: "+name+"\nCurrent balance: "+balance+"Contact"+contact+"\nTransactions"+transactionList;
  }
}

