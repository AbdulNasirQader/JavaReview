package ReviewClass9;

public class Bank {
    public static void main(String[] args) {

        Customer c=new Customer();
        c.setName("Nasir Qader");
        System.out.println("Name of the customer is "+c.getName());

        c.setSsn(12345676);
        System.out.println("SSN of the customer is "+c.getSsn());
    }
}
