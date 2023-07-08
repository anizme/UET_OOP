package W9;

public class InvalidFundingAmountException extends BankException{
    public InvalidFundingAmountException(double amount){
        super("So tien khong hop le: $%0.2f" + amount);
    }
}
