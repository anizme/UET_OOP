package W4;
import java.util.ArrayList;

public class Account {
    //attribute
    private double balance = 0;
    private ArrayList<Transaction> transactionList = new ArrayList<Transaction>();;

    //method
    private void deposit(double amount){
        if(amount <= 0) System.out.println("So tien ban nap vao khong hop le!");
        else{
            balance += amount;
        }
    }
    private void withdraw(double amount){
        if(amount <= 0) System.out.println("So tien ban rut ra khong hop le!");
        else if(amount > balance) System.out.println("So tien ban rut vuot qua so du!");
        else{
            balance -= amount;
        }
    }

    public void addTransaction(double amount, String operation){
        //Invalid require
        if(operation.compareToIgnoreCase(Transaction.DEPOSIT) * operation.compareToIgnoreCase(Transaction.WITHDRAW) != 0){
            System.out.println("Yeu cau khong hop le!");
            return;
        }
        else{
            if(operation.compareToIgnoreCase(Transaction.DEPOSIT) == 0) deposit(amount);
            else withdraw(amount);
            Transaction t = new Transaction(operation, amount, balance);
            transactionList.add(t);
        }
    }
    public void printTransaction(){
        for(int i = 0; i < transactionList.size(); i++){
            if(transactionList.get(i).getOperation().compareToIgnoreCase(Transaction.DEPOSIT) == 0)
                System.out.printf("Giao dich %d: Nap tien: $%.2f. So du luc nay: $%.2f",
                                 (i + 1), transactionList.get(i).getAmount(), transactionList.get(i).getBalance());
            else{
                System.out.printf("Giao dich %d: Rut tien: $%.2f. So du luc nay: $%.2f",
                                 (i + 1), transactionList.get(i).getAmount(), transactionList.get(i).getBalance());  
            }
            System.out.println();
        }
    }
}
