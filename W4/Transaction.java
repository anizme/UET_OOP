package W4;

public class Transaction {
    //attribute
    private String operation;
    private double amount;
    private double balance;
    //constant
    final public static String DEPOSIT = "deposit";
    final public static String WITHDRAW = "withdraw";
    //constructor
    public Transaction(String o, double a, double b){
        operation = o;
        amount = a;
        balance = b;
    }
    //setter
    public void setOperation(String s){
        operation = s;
    }
    public void setAmount(double a){
        amount = a;
    }
    public void setBalance(double b){
        balance = b;
    }
    //getter
    public String getOperation() {return operation;}
    public double getAmount() {return amount;}
    public double getBalance() {return balance;}

}
