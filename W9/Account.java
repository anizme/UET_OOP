package W9;
import java.util.ArrayList;
import java.util.List;

abstract public class Account {
    final public static String CHECKING = "CHECKING";
    final public static String SAVINGS = "SAVINGS";
    //attribute
    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList;
    //constructor
    public Account(){
        accountNumber = 0;
        balance = 0;
        transactionList = new ArrayList<Transaction>();
    }
    public Account(long accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        transactionList = new ArrayList<Transaction>();
    }
    //getter
    public long getAccountNumber() {return accountNumber;}
    public double getBalance() {return balance;}
    public void doWithdrawing(double amount) throws BankException{
        if(amount < 0) throw new InvalidFundingAmountException(amount);
        else if(amount > balance) throw new InsufficientFundsException(amount);
        else{
            balance -= amount;
        }
    }
    public void doDepositing (double amount) throws InvalidFundingAmountException{
        if(amount < 0) throw new InvalidFundingAmountException(amount);
        else{
            balance += amount;
        }

    }
    abstract public void withdraw(double amount);
    abstract public void deposit(double amount);

    public String getTransactionHistory(){
        String ans = "Lich su giao dich cua tai khoan " + accountNumber;
        for(int i = 0; i < transactionList.size(); i++){
            ans = ans + "\n" + transactionList.get(i).getTransactionSummry();
        }
        return ans;
    }
    abstract public void addTransaction(Transaction transaction);
    @Override
    public boolean equals(Object obj){
        if(((Account)obj).getAccountNumber() == accountNumber) return false;
        else return true;
    }
}
