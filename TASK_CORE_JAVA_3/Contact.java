public class Contact{
  String email;
  String phoneNumber;
  
  public void setEmail(String email){
    this.email = email;
  }
  public void setPhoneNumber(String phoneNumber){
    this.phoneNumber = phoneNumber;
  }
  public String getDetails(){
    return " email: "+email+"\n phone: "+phoneNumber;
  }
}
