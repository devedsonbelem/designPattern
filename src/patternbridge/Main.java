package patternbridge;

public class Main {

	
	public static void main(String[] args) {
		Customers  customers = new Customers();
         // Set ConcreteImplementor
         customers.data = new CustomersData("recreio");
         
         customers.show();
         customers.next();
         customers.show();
         customers.next();
         customers.show();
         customers.add("Omar");
         customers.showAll();
          
         
	}
}
