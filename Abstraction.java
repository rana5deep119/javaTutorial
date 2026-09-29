
abstract class Payment {

    double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    abstract void pay();

    void showAmount() {
        System.out.println("the amount is :" + amount);
    }

}
class upiPayment extends Payment{
String upiId;

    public upiPayment(double amount, String upiId) {
        super(amount);
        this.upiId=upiId;
    }
   @Override 
   void pay(){
        System.out.println("the amount paid is :"+amount+" using upi-id : "+upiId);
   }

}
class Abstraction {

    public static void main(String[] args) {
        Payment p=new upiPayment(500, "deepak@upi");
        p.showAmount();
        p.pay();
    }
}
