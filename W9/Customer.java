package W9;
import java.util.List;
import java.util.ArrayList;

public class Customer {
    private long idNumber;
    private String fullName;
    private List<Account> accountList;

    public Customer(){
        idNumber = 0;
        fullName = "";
        accountList = new ArrayList<Account>();
    }
    public Customer(long idNumber, String fullName){
        this.idNumber = idNumber;
        this.fullName = fullName;
        accountList = new ArrayList<Account>();
    }

    public String getCustomerInfo(){
        return "So CMND: " + idNumber + ". Ho ten: " + fullName;
    }
    public void addAccount(Account account){
        accountList.add(account);
    }
    public void removeAccount(Account account){
        accountList.remove(account);
    }
    public long getIdNumber(){
        return idNumber;
    }
    public void setIdNumber(long idNumber){
        this.idNumber = idNumber;
    }
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public List<Account> getAccountList(){
        return accountList;
    }
}
