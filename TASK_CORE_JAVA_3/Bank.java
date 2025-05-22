import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

class Bank {
  
  public static void main(String[] args) {
    Customer customer = new Customer();
    List<Transaction> transactionList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    //customr
    System.out.print("act number: ");
    long accountNumber = sc.nextLong();
    sc.nextLine();
    System.out.print("name: ");
    String name = sc.nextLine();
    System.out.print("balance: ");
    double balance = sc.nextDouble();
    sc.nextLine();
    customer.setAccountNumber(accountNumber);
    customer.setName(name);
    customer.setBalance(balance);
    
    //transaction
    Transaction transaction1 = new Transaction();
    System.out.print("date: ");
    String data = sc.nextLine();
    SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
    try{
       Date date = format.parse(data);
       transaction1.setDate(date);
    }catch (ParseException e){
      System.out.println("format dd/mm/yyyy");
    }
    
    System.out.println("amount: ");
    double amount = sc.nextDouble();
    sc.nextLine();
    System.out.println("type: ");
    String transactionType = sc.nextLine();
    
    transaction1.setAmount(amount);
    
    transaction1.setTransactionType("deposit");
    
    transactionList.add(transaction1);
    customer.setTransactionList(transactionList);
    //contact
    System.out.println("enter mail: ");
    String email = sc.nextLine();
    System.out.println("enter phn number: ");
    String phoneNumber = sc.nextLine();
    Contact contact = new Contact();
    contact.setEmail(email);
    contact.setPhoneNumber(phoneNumber);
    customer.setContact(contact);
    
    //load transaction
    for(Transaction trans: transactionList){
      System.out.println(trans.getDetails());
    }
    //show customer detail
    System.out.println(customer.getDetails());
    //find customer
    System.out.println("enter act number: ");
    long search = sc.nextLong();
    sc.nextLine();
    if(search == customer.getAccountNumber()){
      System.out.println(customer.getDetails());
    }else{
      System.out.println("invalid ID");
    }
    //add money
    System.out.println("acct num: ");
    long search2 = sc.nextLong();
    sc.nextLine();
    System.out.println("amout to deposit: ");
    double amountD = sc.nextDouble();
    sc.nextLine();
    if(search2 == customer.getAccountNumber()){
      balance += amountD;
      System.out.println("credited\n"+"balance: "+ balance);
    }else{
      System.out.println("invalid");
    }
    //withdraw
    System.out.println("acct num: ");
    long search1 = sc.nextLong();
    sc.nextLine();
    System.out.println("amout to withdraw: ");
    double amountW = sc.nextDouble();
    sc.nextLine();
    if(search1 == customer.getAccountNumber()){
      balance -= amountW;
      System.out.println("debited\n"+"balance: "+ balance);
    }else{
      System.out.println("invalid");
    }
    //customer with high balance
    System.out.println("customer with high balance\n");
    if(customer.getBalance() >= 1000){
      System.out.println(customer.getDetails());
    }
    sc.close();
  }
}
