package W9;

public class CheckingAccount extends Account {
    public CheckingAccount(long accountNumber, double balance){
        super(accountNumber, balance);
    }

    public void withdraw(double amount){
        try{
            doWithdrawing(amount);
        } catch(BankException e){
            System.out.println(e);
        }
    }
    public void deposit(double amount){
        try{
            doDepositing(amount);
        } catch(Exception e){
            System.out.println(e);
        }
    }

    @Override
    public void addTransaction(Transaction transaction) {
        if(transaction.getType() == Transaction.TYPE_DEPOSIT_CHECKING) {
            transaction.setInitialBalance(balance);
            deposit(transaction.getAmount());
            transaction.setFinalBalance(balance);
            transactionList.add(transaction);
        }
        else if(transaction.getType() == Transaction.TYPE_WITHDRAW_CHECKING) {
            transaction.setInitialBalance(balance);
            withdraw(transaction.getAmount());
            transaction.setFinalBalance(balance);
            transactionList.add(transaction);
        }
        else {
            System.out.println("Incompatible transaction for this Checking Account!");
        }
    }
}
