package W9;

//import java.io.FileInputStream;
//import java.io.InputStream;

public class Main {
    public static void main(String[] args){
        //InputStream ips = null;
        Bank bank = new Bank();
        /*try{
            ips = new FileInputStream("input.txt");
            bank.readCustomerList(ips);
        } catch(Exception e){
            System.out.println(e);
        }*/
        Customer c1 = new Customer(22028162, "Le Thi Hai Anh");
        Account c1_a1 = new SavingsAccount(291125, 10000);
        Account c1_a2 = new CheckingAccount(291100, 10000);
        c1.addAccount(c1_a1);
        c1.addAccount(c1_a2);
        bank.addCustomer(c1);
        System.out.println(bank.getCustomersInfoByIdOrder());
        Transaction c1_a1_t1 = new Transaction(0, 1000);
        c1_a1.addTransaction(c1_a1_t1);
        c1_a2.addTransaction(c1_a1_t1);
        System.out.println(c1_a2.getTransactionHistory());


    }
}
