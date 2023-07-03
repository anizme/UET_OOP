package W9;
import java.io.InputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;



public class Bank {
    //comparable method
    static class cpName implements Comparator<Customer> {
        @Override
        public int compare(Customer c1, Customer c2){ 
            return c1.getFullName().compareTo(c2.getFullName());
        }
    }

    static class cpId implements Comparator<Customer>{
        @Override
        public int compare(Customer c1, Customer c2){
            return ((Long)c1.getIdNumber()).compareTo(c2.getIdNumber());
        }
    }
    //attribute
    private List<Customer> customerList;
    //constructor
    public Bank() {
        customerList = new ArrayList<Customer>();
    }
    //method
    public void readCustomerList(InputStream inputStream){
        //SOS
    }
    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }
    public String getCustomersInfoByNameOrder(){
        customerList.sort(new cpName());
        String ans = "";
        for(int i = 0; i < customerList.size(); i++){
            ans = ans + customerList.get(i).getCustomerInfo();
        }
        return ans;
    }
    public String getCustomersInfoByIdOrder(){
        customerList.sort(new cpId());
        String ans = "";
        for(int i = 0; i < customerList.size(); i++){
            ans += customerList.get(i).getCustomerInfo();
        }
        return ans;
    }
    public List<Customer> getCustomerList(){
        return customerList;
    }
}
