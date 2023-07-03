package W9;

public class Transaction {
    final public static int TYPE_DEPOSIT_CHECKING = 0;
    final public static int TYPE_WITHDRAW_CHECKING = 1;
    final public static int TYPE_DEPOSIT_SAVINGS = 2;
    final public static int TYPE_WITHDRAW_SAVINGS = 3;

    private int type;
    private double amount;
    private double initialBalance;
    private double finalBalance;

    public Transaction(int type, double amount){
        this.type = type;
        this.amount = amount;
        initialBalance = finalBalance = 0;
    }
    //setter
    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }
    public void setFinalBalance(double finalBalance) {
        this.finalBalance = finalBalance;
    }
    //getter
    public int getType() {return type;}
    public double getAmount() {return amount;}
    public String getTransactionTypeString(int p_type){ //parameter type
        //this.type = type;
        if(p_type == TYPE_DEPOSIT_CHECKING) return "Nap tien vang lai";
        else if(p_type == TYPE_DEPOSIT_SAVINGS) return "Nap tien tiet kiem";
        else if(p_type == TYPE_WITHDRAW_CHECKING) return "Rut tien vang lai";
        else if(p_type == TYPE_WITHDRAW_SAVINGS) return "Rut tien tiet kiem";
        return "Khong hop le";
    }
    public String getTransactionSummry(){
        String s1 = "Kieu giao dich: " + getTransactionTypeString(type) +". ";
        String s2 = "So du ban dau: $" + initialBalance + ". ";
        String s3 = "So tien: $" + amount + ". ";
        String s4 = "So du cuoi: $" + finalBalance + ". ";
        return s1 + s2 + s3 + s4;
    }
}