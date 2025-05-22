import java.util.Date;

public class Transaction{
  Date date;
  double amount;
  String transactionType;
  
  public void setDate(Date date){
    this.date = date;
  }
  public void setAmount(double amount){
    this.amount = amount;
  }
  public void setTransactionType(String transactionType){
    this.transactionType = transactionType;
  }
  public String getDetails(){
    return " Date: "+ date + "\n Amount: " + amount+ "\n type: "+ transactionType;
  }
}
