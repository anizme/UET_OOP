package W9;

public class InsufficientFundsException extends BankException {
    public InsufficientFundsException(double amount){
        super("So du tai khoan khong du $%0.2f" + amount + " de thuc hien giao dich");
    }
}
