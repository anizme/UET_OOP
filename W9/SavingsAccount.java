package W9;

public class SavingsAccount extends Account {
    public SavingsAccount(long accountNumber, double balance){
        super(accountNumber, balance);
    }

    public void withdraw(double amount){
        try{
            if(amount > 1000) throw new InvalidFundingAmountException(amount);
            else if(balance < 5000) throw new InsufficientFundsException(amount);
            else{
                doWithdrawing(amount);
            } 
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
        if(transaction.getType() == Transaction.TYPE_DEPOSIT_SAVINGS) {
            transaction.setInitialBalance(balance);
            deposit(transaction.getAmount());
            transaction.setFinalBalance(balance);
            transactionList.add(transaction);
        }
        else if(transaction.getType() == Transaction.TYPE_WITHDRAW_SAVINGS) {
            transaction.setInitialBalance(balance);
            withdraw(transaction.getAmount());
            transaction.setFinalBalance(balance);
            transactionList.add(transaction);
        }
        else {
            System.out.println("Incompatible transaction for this Saving Account");
        }
    }
}
